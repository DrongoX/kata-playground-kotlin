package uk.zinch.kata

data class Rover(val x: Int, val y: Int, val orientation: Orientation) {
  fun receiveMission(mission: Char) =
    when (orientation) {
      Orientation.WEST  -> handleWest()
      Orientation.SOUTH -> handleSouth()
      Orientation.NORTH -> handleNorth()
    }

  private fun handleNorth() = Rover(x, y - 1, Orientation.NORTH)
  private fun handleSouth() = Rover(x, increment(y), Orientation.SOUTH)
  private fun handleWest() = Rover(increment(x), y, Orientation.WEST)

  private fun increment(coordinate: Int) = if (coordinate == COORDINATES_UPPER_BOUND) COORDINATES_LOWER_BOUND else coordinate + 1

  enum class Orientation {
    SOUTH,
    WEST,
    NORTH
  }
}

const val COORDINATES_LOWER_BOUND = 0
const val COORDINATES_UPPER_BOUND = 10
