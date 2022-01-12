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

With:
```lang-txt
2022-01-12 16:16:15.553  WARN 14100 --- [nio-8080-exec-3] .w.s.m.s.DefaultHandlerExceptionResolver :
  Resolved [org.springframework.web.bind.MethodArgumentNotValidException:
    Validation failed for argument [0] in public com.example.validationdemo.Event com.example.validationdemo.ApiController.createEvent(com.example.validationdemo.Event):
      [Field error in object 'event' on field 'name':
        rejected value []; codes [NotBlank.event.name,NotBlank.name,NotBlank.java.lang.String,NotBlank]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable:
          codes [event.name,name]; arguments []; default message [name]]; default message [**localized not_empty message**]
      ] 
  ]
 ```
 ..warning in server console.



