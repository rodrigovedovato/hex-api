package io.github.vedovato.hex.domain.cabinetmanagement

import io.github.vedovato.hex.domain.cabinetmanagement.infrastructure.ListUsers
import io.github.vedovato.hex.domain.cabinetmanagement.model.User
import io.github.vedovato.hex.domain.common.model.Coordinate

class UserManager(private val storage: ListUsers) {
    fun getCabinetsInRange(coordinate: Coordinate, rangeInMeters: Int): List<User> {
        return storage.getCabinetsInRange(coordinate, rangeInMeters)
    }
}