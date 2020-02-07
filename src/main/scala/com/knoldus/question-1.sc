class Fibonacci {
  def fibonacciFunction(limitOfSequence: Int): Array[Int] = {

    @scala.annotation.tailrec
    def fibonacciRecursive(limitOfSequence: Int, previousNumber: Int, nextNumber: Int, fibonacciSequence: Array[Int]): Array[Int] = limitOfSequence match {
      case limitOfSequence if limitOfSequence < 0 => Array(-1)
      case 1 => fibonacciSequence :+ previousNumber
      case _ => fibonacciRecursive(limitOfSequence - 1, nextNumber, previousNumber + nextNumber, fibonacciSequence :+ previousNumber)
    }

    fibonacciRecursive(limitOfSequence, 0, 1, Array[Int]())
  }
}

object Fibonacci extends App {
  println("Enter the limit up to which you require fibonacci sequence: ")
  val limitOfSequence = scala.io.StdIn.readInt()
  val fibonacciObject = new Fibonacci()
  fibonacciObject.fibonacciFunction(limitOfSequence).foreach(fib => print(fib + " "))
  println()
}
