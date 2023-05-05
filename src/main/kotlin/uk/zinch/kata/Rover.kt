package uk.zinch.kata

data class Rover(val x: Int, val y: Int, val orientation: Orientation) {
  fun receiveMission(mission: Char) =
    if (orientation == Orientation.WEST) handleWest()
    else handleSouth()

  private fun handleSouth() = Rover(x, if (y == 10) 0 else y + 1, Orientation.SOUTH)

  private fun handleWest() = Rover(5, y, Orientation.WEST)

  enum class Orientation {
    SOUTH,
    WEST
  }
}
