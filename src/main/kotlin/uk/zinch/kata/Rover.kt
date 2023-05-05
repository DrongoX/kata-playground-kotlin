package uk.zinch.kata

data class Rover(val x: Int, val y: Int, val orientation: Orientation) {
  fun receiveMission(mission: Char) = if (mission == 'B') orientation.moveBackwards(x, y)
  else
    Rover(x, y, when (orientation) {
      Orientation.WEST -> Orientation.SOUTH
      Orientation.NORTH-> Orientation.WEST
      Orientation.SOUTH-> Orientation.EAST
      Orientation.EAST-> Orientation.NORTH
    })

  companion object {
    fun increment(coordinate: Int) = if (coordinate == COORDINATES_UPPER_BOUND) COORDINATES_LOWER_BOUND else coordinate + 1
    fun decrement(coordinate: Int) = if (coordinate == COORDINATES_LOWER_BOUND) COORDINATES_UPPER_BOUND else coordinate - 1
  }

  enum class Orientation(val backwardsLogic: (Int, Int) -> Rover) {
    SOUTH({ x, y -> Rover(x, increment(y), SOUTH) }),
    WEST({ x, y -> Rover(increment(x), y, WEST) }),
    NORTH({ x, y -> Rover(x, decrement(y), NORTH) }),
    EAST({ x, y -> Rover(decrement(x), y, EAST) });

    fun moveBackwards(x: Int, y: Int) = backwardsLogic.invoke(x, y)
  }
}

const val COORDINATES_LOWER_BOUND = 0
const val COORDINATES_UPPER_BOUND = 10
