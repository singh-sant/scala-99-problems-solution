package kup.knoldus.scala99

import scala.annotation.tailrec

object P33 extends App {

  def isCoprime(num1: Int, num2: Int): Boolean = {

    @tailrec
    def gcd(num1: Int, num2: Int): Int = {
      if (num2 == 0) num1
      else gcd(num2, num1 % num2)
    }

    if (gcd(num1, num2) == 1) true else false
  }

  println(isCoprime(35,64))
}