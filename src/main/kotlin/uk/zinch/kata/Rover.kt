package uk.zinch.kata

data class Rover(val x: Int, val y: Int, val orientation: Orientation) {
  fun receiveMission(mission: Char) = Rover(x,
   if (y == 8) 9
   else 8
    , Orientation.SOUTH)

  enum class Orientation {
    SOUTH
  }
}
