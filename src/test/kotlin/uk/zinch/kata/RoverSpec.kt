package uk.zinch.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RoverSpec {
  @Test
  fun `The rover not on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is SOUTH`() {
    // given
    val rover = Rover(3, 8, Rover.Orientation.SOUTH)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(3,9,Rover.Orientation.SOUTH))
  }
}
