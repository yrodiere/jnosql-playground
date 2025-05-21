package org.acme;

import java.util.Optional;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.jnosql.mapping.graph.GraphTemplate;

@Path("/test")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {

	@Inject
	protected GraphTemplate template;

	@POST
	public void create(TestEntity entity) {
		template.insert( entity );
	}

	@GET
	@Path("/{id}")
	public Optional<TestEntity> retrieve(String id) {
		return template.find( TestEntity.class, id );
	}

	@PUT
	public void update(TestEntity entity) {
		template.update( entity );
	}

	@DELETE
	public void delete(String id) {
		template.delete( TestEntity.class, id );
	}
}
