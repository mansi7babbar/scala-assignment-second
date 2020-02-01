def fibonacci(limit: Int): Int = {
  @scala.annotation.tailrec
  def fib(limit: Int, first :Int, second: Int): Int = limit match{
      case 0 => -1
      case 1 => first
      case _ => fib(limit-1, second, first + second)
  }
  fib(limit, 0, 1)
}

fibonacci(7)