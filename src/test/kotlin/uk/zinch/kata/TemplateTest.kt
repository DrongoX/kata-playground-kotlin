package uk.zinch.kata

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class TemplateTest: ShouldSpec(
  {
      should("return 4 for input 4") {
        // when
        val result = RPNCalculator().calculate("4")
        // then
        result shouldBe 4
      }

    should("return 5 for input 5") {
      // when
      val result = RPNCalculator().calculate("5")
      // then
      result shouldBe 5
    }

    should("return 3 for input 3") {
      // when
      val result = RPNCalculator().calculate("3")
      // then
      result shouldBe 3
    }

    should("return 7 for input 7") {
      // when
      val result = RPNCalculator().calculate("7")
      // then
      result shouldBe 7
    }

    should("return 12 for input 12") {
      // when
      val result = RPNCalculator().calculate("12")
      // then
      result shouldBe 12
    }
  })
