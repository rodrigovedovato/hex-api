package io.github.vedovato.hex.domain.usermanagement.infrastructure

import io.github.vedovato.hex.domain.usermanagement.model.User
import io.github.vedovato.hex.domain.common.model.Coordinate

interface ListUsers {
    fun getCabinetsInRange(coordinate: Coordinate, rangeInMeters: Int): List<User>
}