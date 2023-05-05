package uk.zinch.kata

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test


class TemplateTest {
  @Test
  fun `this is a test example asserting 2x2=4`() {
    //given
    val template = Template()
    //when
    val result = template.multiply(2, 2)
    //then
    assertThat(result).isEqualTo(4)
  }
}
