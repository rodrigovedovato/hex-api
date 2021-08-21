package io.github.vedovato.hex.infrastructure.mock

import io.github.vedovato.hex.domain.usermanagement.infrastructure.ListUsers
import io.github.vedovato.hex.domain.usermanagement.model.User
import io.github.vedovato.hex.domain.usermanagement.model.UserStatus
import io.github.vedovato.hex.domain.common.model.Coordinate
import java.util.*

class FakeUserStorage : ListUsers {
    override fun getUsersInRange(coordinate: Coordinate, rangeInMeters: Int): List<User> {
        return listOf(
            User(UUID.randomUUID(), Coordinate(-8.06232309651, -34.8712023897282), UserStatus.ONLINE),
            User(UUID.randomUUID(), Coordinate(-23.5904697733405, -46.66408239213214), UserStatus.OFFLINE)
        )
    }
}