package uk.zinch.kata

data class Rover(val x: Int, val y: Int, val orientation: Orientation) {

  fun receiveMission(mission: Char) = mission.toCommand().executeMissionFrom(orientation, x, y)

  companion object {
    fun increment(coordinate: Int) = if (coordinate == COORDINATES_UPPER_BOUND) COORDINATES_LOWER_BOUND else coordinate + 1
    fun decrement(coordinate: Int) = if (coordinate == COORDINATES_LOWER_BOUND) COORDINATES_UPPER_BOUND else coordinate - 1
  }

  enum class Orientation(private val backwardsLogic: (Int, Int) -> Rover,
                         private val forwardLogic: (Int, Int) -> Rover,
                         private val leftTurnLogic: (Int, Int) -> Rover,
                         private val rightTurnLogic: (Int, Int) -> Rover) {
    SOUTH({ x, y -> Rover(x, increment(y), SOUTH) },
          { x, y -> Rover(x, decrement(y), SOUTH) },
          { x, y -> Rover(x, y, EAST) },
          { x, y -> Rover(x, y, WEST) }),
    WEST({ x, y -> Rover(increment(x), y, WEST) },
         { x, y -> Rover(decrement(x), y, WEST) },
         { x, y -> Rover(x, y, SOUTH) },
         { x, y -> Rover(x, y, NORTH) }),
    NORTH({ x, y -> Rover(x, decrement(y), NORTH) },
          { x, y -> Rover(x, increment(y), NORTH) },
          { x, y -> Rover(x, y, WEST) },
          { x, y -> Rover(x, y, EAST) }),
    EAST({ x, y -> Rover(decrement(x), y, EAST) },
         { x, y -> Rover(increment(x), y, EAST) },
         { x, y -> Rover(x, y, NORTH) },
         { x, y -> Rover(x, y, SOUTH) });

    fun moveBackwards(x: Int, y: Int) = backwardsLogic.invoke(x, y)
    fun moveForward(x: Int, y: Int) = forwardLogic.invoke(x, y)
    fun turnLeft(x: Int, y: Int) = leftTurnLogic.invoke(x, y)
    fun turnRight(x: Int, y: Int) = rightTurnLogic.invoke(x, y)
  }


  enum class Command(private val missionSignal: Char, private val commandLogic: (Orientation, Int, Int) -> Rover) {
    FORWARD('F', { orientation, x, y -> orientation.moveForward(x, y) }),
    BACKWARD('B', { orientation, x, y -> orientation.moveBackwards(x, y) }),
    LEFT_TURN('L', { orientation, x, y -> orientation.turnLeft(x, y) }),
    RIGHT_TURN('R', { orientation, x, y -> orientation.turnRight(x, y) });

    fun executeMissionFrom(orientation: Orientation, x: Int, y: Int) = commandLogic.invoke(orientation, x, y)

    companion object {
      fun valueOf(requestedMissionSignal: Char) = Command.values().find { it.missionSignal == requestedMissionSignal }!!
    }
  }
}

private fun Char.toCommand() = Rover.Command.valueOf(this)

const val COORDINATES_LOWER_BOUND = 0
const val COORDINATES_UPPER_BOUND = 10
