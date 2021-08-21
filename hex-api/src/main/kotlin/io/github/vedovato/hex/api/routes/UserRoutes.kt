package io.github.vedovato.hex.api.routes

import io.github.vedovato.hex.api.handlers.UserHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.function.router

@Configuration
class UserRoutes(private val userHandler: UserHandler) {

    @Bean
    fun routes() = router {
        "/users/nearby".nest {
            GET(userHandler::getUsersInRange)
        }
    }
}