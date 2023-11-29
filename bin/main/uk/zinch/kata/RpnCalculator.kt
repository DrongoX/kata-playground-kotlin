package uk.zinch.kata

import jdk.dynalink.Operation

class RpnCalculator {


  fun calculate(expression: String) : Int {
    Operation.from(expression).execute(firstOperandFrom(expression), secondOperandFrom(expression))
  }

   /*when {
     isSum(expression) -> calculateSum(expression)
     isProduct(expression)     -> calculateProduct(expression)
     isSubtraction(expression) -> calculateSubtraction(expression)
     isDivision(expression) -> calculateDivision(expression)
     else                      -> calculateConstant(expression)
   }*/

  private val DELIMITER = " "

  private fun calculateSum(expression: String) : Int = firstOperandFrom(expression) + secondOperandFrom(expression)

  private fun calculateProduct(expression: String) : Int = firstOperandFrom(expression) * secondOperandFrom(expression)

  private fun calculateSubtraction(expression: String) : Int = firstOperandFrom(expression) - secondOperandFrom(expression)

  private fun calculateDivision(expression: String) : Int = firstOperandFrom(expression) / secondOperandFrom(expression)

  private fun firstOperandFrom(expression: String): Int = expression.split(DELIMITER)[0].toInt()

  private fun secondOperandFrom(expression: String): Int = expression.split(DELIMITER)[1].toInt()

  private fun calculateConstant(expression: String) = expression.toInt()

  private fun isSum(expression: String) = expression.contains("+")

  private fun isProduct(expression: String) = expression.contains("*")

  private fun isSubtraction(expression: String) = expression.contains("-")

  private fun isDivision(expression: String) = expression.contains("/")

}