package kup.knoldus.scala99

object P32 extends App {

  def gcd(num1: Int, num2: Int): Int = {
    if( num2 == 0) num1
    else gcd(num2, num1 % num2)
  }

  println(gcd(36, 63))

}
