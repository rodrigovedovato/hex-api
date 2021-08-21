package io.github.vedovato.hex.domain.cabinetmanagement.infrastructure

import io.github.vedovato.hex.domain.cabinetmanagement.model.User
import io.github.vedovato.hex.domain.common.model.Coordinate

interface ListUsers {
    fun getCabinetsInRange(coordinate: Coordinate, rangeInMeters: Int): List<User>
}