def sum(firstNumber:Int, secondNumber:Int, sumFunction:(Int,Int)=>Int):Int = {
  sumFunction(firstNumber,secondNumber)
}
val sumOfSquares = (first:Int, second:Int) => first*first + second*second
val sumOfCubes = (first:Int, second:Int) => first*first*first + second*second*second
val sumOfInts = (first:Int, second:Int) => first + second

sum(5, 10, sumOfSquares)
sum(5, 10, sumOfCubes)
sum(5, 10, sumOfInts)