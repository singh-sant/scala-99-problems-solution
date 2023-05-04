package kup.knoldus.scala99

import scala.util.Random

object P24 extends App {

  def generateRandomList(length: Int, limit: Int): List[Int] = {
    if(length>0) Random.between(1, limit) :: generateRandomList(length - 1, limit)
    else Nil
  }

  println(generateRandomList(6, 49))
}