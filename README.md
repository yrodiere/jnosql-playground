# jnosql-playground

Small project to try out jnosql.

## How to try it

```
quarkus dev
```

In a terminal:

```
curl -vvv -H'Content-Type: application/json' -XPOST localhost:8080/test/ -d'{
"id":"foo",
"testField":"bar"
}'
```

Then go to http://localhost:8080/q/dev-ui/, click "Neo4j browser". Password is "password".

In the Neo4j browser, type in the query:

```cypher
MATCH (any) RETURN any
```