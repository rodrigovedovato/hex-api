package io.github.vedovato.hex.api.handlers

import io.github.vedovato.hex.domain.usermanagement.UserManager
import io.github.vedovato.hex.domain.common.model.Coordinate
import org.springframework.stereotype.Component
import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.ServerResponse
import org.springframework.web.servlet.function.ServerResponse.notFound
import org.springframework.web.servlet.function.ServerResponse.ok
import java.util.*

@Component
class UserHandler(private val userManager: UserManager) {
    data class UserRequest(val coordinate: Coordinate, val rangeInMeters: Int)

    fun getUsersInRange(req: ServerRequest) : ServerResponse {
        val requestCoordinate = req.param("loc").map(Coordinate.Companion::fromString)
        val rangeParam = req.param("rng").map(String::toInt)

        val parameters : Optional<UserRequest> = requestCoordinate.flatMap { coordinate ->
            rangeParam.map { range ->
                UserRequest(coordinate, range)
            }
        }

        return if (parameters.isEmpty) {
            notFound().build()
        } else {
            ok().body(userManager.getUsersInRange(parameters.get().coordinate, parameters.get().rangeInMeters))
        }
    }
}