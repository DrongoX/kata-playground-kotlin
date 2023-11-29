package uk.zinch.kata

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class RpnCalculatorTest: ShouldSpec(
  {
      should("return 4 for input 4") {
        // when
        val result = RpnCalculator().calculate("4")
        // then
        result shouldBe 4
      }

    should("return 5 for input 5") {
      // when
      val result = RpnCalculator().calculate("5")
      // then
      result shouldBe 5
    }

    should("return 3 for input 3") {
      // when
      val result = RpnCalculator().calculate("3")
      // then
      result shouldBe 3
    }

    should("return 7 for input 7") {
      // when
      val result = RpnCalculator().calculate("7")
      // then
      result shouldBe 7
    }

    should("return 12 for input 12") {
      // when
      val result = RpnCalculator().calculate("12")
      // then
      result shouldBe 12
    }

    should("return 4 for input 2 2 +") {
      val result = RpnCalculator().calculate("2 2 +")
      result shouldBe 4
    }

    should("return 8 for input 4 4 +") {
      val result = RpnCalculator().calculate("4 4 +")
      result shouldBe 8
    }

    should("return 9 for input 4 5 +") {
      val result = RpnCalculator().calculate("4 5 +")
      result shouldBe 9
    }

    should("return 22 for input 15 7 +") {
      val result = RpnCalculator().calculate("15 7 +")
      result shouldBe 22
    }
  })
