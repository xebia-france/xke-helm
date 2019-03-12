package fr.xebia.xke.helm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroserviceAApplication

fun main(args: Array<String>) {
    runApplication<MicroserviceAApplication>(*args)
}
