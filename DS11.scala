object SimpleTasks {
  def add(): Unit = {
    println("Enter the first number for addition:")
    val num1 = scala.io.StdIn.readInt() 
    println("Enter the second number for addition:")
    val num2 = scala.io.StdIn.readInt() 
    val sum = num1 + num2 
    println(s"The sum of $num1 and $num2 is $sum.") 
  }
  def checkEvenOdd(): Unit = {
    println("Enter a number to check if it's even or odd:")
    val num = scala.io.StdIn.readInt() 
    if (num % 2 == 0) {
      println(s"$num is an even number.") 
    } else {
      println(s"$num is an odd number.") 
    }
  }
  def calculateSquareArea(): Unit = {
    println("Enter the length of the square's side:")
    val side = scala.io.StdIn.readFloat() 
    val area = side * side 
    println(s"The area of a square with side $side is $area.")
  }
  def main(args: Array[String]): Unit = {
    add()
    checkEvenOdd()
    calculateSquareArea()
  }
}
