package io.github.vedovato.hex.api

import io.github.vedovato.hex.domain.usermanagement.UserManager
import io.github.vedovato.hex.infrastructure.mock.FakeUserStorage
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Runtime {
    private val fakeUserStorage = FakeUserStorage()

    @Bean
    fun userManager() : UserManager {
        return UserManager(fakeUserStorage)
    }
}