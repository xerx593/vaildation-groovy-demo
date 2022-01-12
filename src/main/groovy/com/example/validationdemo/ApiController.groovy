package com.example.validationdemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid


@RestController
class ApiController {

    @Autowired
    EventRepository eventService

    @PostMapping("/api/event")
    Event createEvent(@Valid @RequestBody Event event) {
        eventService.save(event)
    }
}