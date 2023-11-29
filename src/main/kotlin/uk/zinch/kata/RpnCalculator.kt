package uk.zinch.kata


class RpnCalculator {

  fun calculate(expression: String) : Int =
    when {
      isConstant(expression) -> calculateConstant(expression)
      else -> Operation.from(expression).execute(firstOperandFrom(expression), secondOperandFrom(expression))
    }

  private val DELIMITER = " "

  private fun firstOperandFrom(expression: String): Int = expression.split(DELIMITER)[0].toInt()

  private fun secondOperandFrom(expression: String): Int = expression.split(DELIMITER)[1].toInt()

  private fun calculateConstant(expression: String) = expression.toInt()

  private fun isConstant(expression: String) = expression.contains(DELIMITER).not()
}



enum class Operation(val symbol: String, val operation: (Int, Int) -> Int){
    SUM("+",{a,b -> a+b}), PRODUCT("*", {a,b -> a*b}), SUBTRACTION("-", {a,b -> a-b}), DIVISION("/",{a,b -> a/b});

  fun execute(firstOperandFrom: Int, secondOperandFrom: Int): Int = operation(firstOperandFrom, secondOperandFrom)

  companion object{
     fun from (expression: String): Operation  = values().first { expression.contains(it.symbol) }
   }
}
