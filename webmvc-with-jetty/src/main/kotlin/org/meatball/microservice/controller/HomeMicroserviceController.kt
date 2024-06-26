package org.meatball.microservice.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HomeMicroserviceController @Autowired constructor(
    private val microserviceController: MicroserviceController
) {

    @GetMapping("/")
    fun home(): String {
        return microserviceController.home()
    }
}