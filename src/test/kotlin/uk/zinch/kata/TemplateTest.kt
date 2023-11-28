package uk.zinch.kata

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class TemplateTest: ShouldSpec(
  {
    context("multiply function") {
      should("return 4 for input 2x2") {
        // given
        val template = Template()
        // when
        val result = template.multiply(2, 2)
        // then
        result shouldBe 4
      }
    }
  })
