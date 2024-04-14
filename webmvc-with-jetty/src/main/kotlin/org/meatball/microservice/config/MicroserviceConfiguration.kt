package org.meatball.microservice.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MicroserviceConfiguration {

    @Bean
    fun getTestBean(): Aboba {
        return Aboba()
    }
}

class Aboba(val a: String = "123")