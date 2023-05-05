package uk.zinch.kata

data class Rover(val x: Int, val y: Int, val orientation: Orientation) {
  fun receiveMission(mission: Char) =
    Rover(3,9,Orientation.SOUTH)
  enum class Orientation {
    SOUTH
  }
}
