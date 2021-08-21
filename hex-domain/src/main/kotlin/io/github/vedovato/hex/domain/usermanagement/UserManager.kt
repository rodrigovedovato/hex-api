package io.github.vedovato.hex.domain.usermanagement

import io.github.vedovato.hex.domain.usermanagement.infrastructure.ListUsers
import io.github.vedovato.hex.domain.usermanagement.model.User
import io.github.vedovato.hex.domain.common.model.Coordinate

class UserManager(private val storage: ListUsers) {
    fun getUsersInRange(coordinate: Coordinate, rangeInMeters: Int): List<User> {
        return storage.getUsersInRange(coordinate, rangeInMeters)
    }
}