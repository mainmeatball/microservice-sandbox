package org.meatball.microservice.controller

import org.meatball.microservice.config.MicroserviceProperties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Duration
import java.time.temporal.ChronoUnit
import java.util.*

@RestController
@RequestMapping("/api/v1")
class MicroserviceController @Autowired constructor(
    private val microserviceProperties: MicroserviceProperties
) {

    @GetMapping("/")
    fun home(): String {
        return microserviceProperties.title
    }

    @GetMapping("/slow")
    fun slow(): String {
        Thread.sleep(Duration.of(3L, ChronoUnit.SECONDS))
        return "Slow operation"
    }

    @GetMapping("/fast")
    fun fast(): String {
        return "Fast operation"
    }

    @GetMapping("/error")
    fun error(): String {
        throw IllegalStateException("Error operation")
    }
}

