package uk.zinch.kata

class RpnCalculator {

  fun calculate(expression: String) : Int =
    if(isSum(expression)) {
      calculateSum(expression)
    } else {
      calculateConstant(expression)
    }

  private val DELIMITER = " "

  private fun calculateSum(expression: String) : Int = firstOperandFrom(expression) + secondOperandFrom(expression)

  private fun firstOperandFrom(expression: String): Int = expression.split(DELIMITER)[0].toInt()

  private fun secondOperandFrom(expression: String): Int = expression.split(DELIMITER)[1].toInt()

  private fun calculateConstant(expression: String) = expression.toInt()

  private fun isSum(expression: String) = expression.contains("+")



}