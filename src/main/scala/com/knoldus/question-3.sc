def sum(firstNumber: Int, secondNumber: Int, sumFunction: (Int, Int) => Int): Int = {
  sumFunction(firstNumber, secondNumber)
}
val sumOfSquares = (firstNumber: Int, secondNumber: Int) => firstNumber * firstNumber + secondNumber * secondNumber
val sumOfCubes = (firstNumber: Int, secondNumber: Int) => firstNumber * firstNumber * firstNumber + secondNumber * secondNumber * secondNumber
val sumOfInts = (firstNumber: Int, secondNumber: Int) => firstNumber + secondNumber

sum(5, 10, sumOfSquares)
sum(5, 10, sumOfCubes)
sum(5, 10, sumOfInts)

