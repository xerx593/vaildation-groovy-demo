# vaildation-groovy-demo
https://stackoverflow.com/q/70673578/592355

## Running

```lang-bash
export JAVA_HOME=/path/to/jdk11
mvn clean spring-boot:run
```
### Testing

```lang-bash
curl --location --request POST 'localhost:8080/api/event' \
--header 'Content-Type: application/json' \
--data-raw '{"name": ""}'
```
should result in:
```lang-json
{
  "timestamp":"20xxx+00:00",
  "status":400,
  "error":"Bad Request",
  "path":"/api/event"
}
```

