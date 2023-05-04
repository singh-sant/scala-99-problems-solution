package kup.knoldus.scala99

import scala.annotation.tailrec

object P31 extends App {

  def isPrime(num: Int): Boolean = {
    if (num == 1) false
    else {
      @tailrec
      def helper(input: Int): Boolean = {
        if (input == 1) true
        else if (num % input == 0) false
        else helper(input - 1)
      }

      helper(num / 2)
    }
  }
  
  println(isPrime(23))
}