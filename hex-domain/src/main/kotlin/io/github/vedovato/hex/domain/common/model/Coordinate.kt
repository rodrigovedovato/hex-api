package io.github.vedovato.hex.domain.common.model

data class Coordinate(val latitude: Double, val longitude: Double) {
    companion object {
        fun fromString(string: String): Coordinate {
            val coordinates = string.split(',').map { coordinate ->
                coordinate.toDouble()
            }

            return Coordinate(coordinates[0], coordinates[1])
        }
    }
}

