package org.meatball.microservice

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication(
    scanBasePackages = ["org.meatball.microservice"]
)
@ConfigurationPropertiesScan(
    basePackages = ["org.meatball.microservice.config"]
)
class MicroserviceApplication

fun main(args: Array<String>) {
    runApplication<MicroserviceApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}