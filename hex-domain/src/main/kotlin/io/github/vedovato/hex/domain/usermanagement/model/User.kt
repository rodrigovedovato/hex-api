package io.github.vedovato.hex.domain.usermanagement.model

import java.util.UUID
import io.github.vedovato.hex.domain.common.model.Coordinate

data class User(val id: UUID, val location: Coordinate, val status: UserStatus)
