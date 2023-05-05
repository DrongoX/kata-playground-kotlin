package uk.zinch.kata

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import uk.zinch.kata.Rover.Orientation.*

class RoverSpec {
  @Test
  fun `The rover not on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is SOUTH 3, 8`() {
    // given
    val rover = Rover(3, 8, SOUTH)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(3, 9, SOUTH))
  }

  @Test
  fun `The rover not on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is SOUTH 4, 8`() {
    // given
    val rover = Rover(4, 8, SOUTH)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(4, 9, SOUTH))
  }

  @Test
  fun `The rover not on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is SOUTH 5, 8`() {
    // given
    val rover = Rover(5, 8, SOUTH)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(5, 9, SOUTH))
  }

  @Test
  fun `The rover not on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is SOUTH 4, 7`() {
    // given
    val rover = Rover(4, 7, SOUTH)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(4, 8, SOUTH))
  }

  @Test
  fun `The rover not on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is SOUTH 4, 2`() {
    // given
    val rover = Rover(4, 2, SOUTH)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(4, 3, SOUTH))
  }

  @Test
  fun `The rover is on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is SOUTH 4, 10`() {
    // given
    val rover = Rover(4, 10, SOUTH)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(4, 0, SOUTH))
  }

  @Test
  fun `The rover not on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is WEST 4, 2`() {
    // given
    val rover = Rover(4, 2, WEST)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(5, 2, WEST))
  }

  @Test
  fun `The rover not on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is WEST 4, 3`() {
    // given
    val rover = Rover(4, 3, WEST)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(5, 3, WEST))
  }

  @Test
  fun `The rover not on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is WEST 4, 5`() {
    // given
    val rover = Rover(4, 5, WEST)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(5, 5, WEST))
  }

  @Test
  fun `The rover not on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is WEST 3, 5`() {
    // given
    val rover = Rover(3, 5, WEST)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(4, 5, WEST))
  }

  @Test
  fun `The rover not on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is WEST 2, 5`() {
    // given
    val rover = Rover(2, 5, WEST)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(3, 5, WEST))
  }
  @Test
  fun `The rover is on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is WEST 10, 5`() {
    // given
    val rover = Rover(10, 5, WEST)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(0, 5, WEST))
  }

  @Test
  fun `The rover not on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is NORTH 3, 5`() {
    // given
    val rover = Rover(3, 5, NORTH)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(3, 4, NORTH))
  }
  @Test
  fun `The rover is on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is NORTH 3, 0`() {
    // given
    val rover = Rover(3, 0, NORTH)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(3, 10, NORTH))
  }

  @Test
  fun `The rover is not on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is EAST 3, 2`() {
    // given
    val rover = Rover(3, 2, EAST)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(2, 2, EAST))
  }

  @Test
  fun `The rover is on the edge of the map moves backward 1 step when I enter a 'B' command and the orientation is EAST 0, 2`() {
    // given
    val rover = Rover(0, 2, EAST)
    // when
    val updatedRover = rover.receiveMission('B')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(10, 2, EAST))
  }
  @Test
  fun `The rover turns to the west when I enter a 'L' command and the orientation is NORTH`() {
    // given
    val rover = Rover(3, 8, NORTH)
    // when
    val updatedRover = rover.receiveMission('L')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(3, 8, WEST))
  }

  @Test
  fun `The rover turns to the south when I enter a 'L' command and the orientation is WEST`() {
    // given
    val rover = Rover(3, 8, WEST)
    // when
    val updatedRover = rover.receiveMission('L')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(3, 8, SOUTH))
  }

  @Test
  fun `The rover turns to the east when I enter a 'L' command and the orientation is SOUTH`() {
    // given
    val rover = Rover(3, 8, SOUTH)
    // when
    val updatedRover = rover.receiveMission('L')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(3, 8, EAST))
  }

  @Test
  fun `The rover turns to the north when I enter a 'L' command and the orientation is EAST`() {
    // given
    val rover = Rover(3, 8, EAST)
    // when
    val updatedRover = rover.receiveMission('L')
    // expect
    assertThat(updatedRover).isEqualTo(Rover(3, 8, NORTH))
  }
  }
