package kup.knoldus.scala99

import scala.annotation.tailrec

object P03 extends App {

  @tailrec
  private def findKthElement[T](list: List[T], position: Int): T = list match {
    case head :: _ if (position == 1) => head
    case ::(_, tail) => findKthElement(tail, position - 1)
    case Nil => throw new IllegalArgumentException()
  }

  val list = List(1, 2, 3, 4, 5)
  val position = 2

  val list2 = List()
  println(findKthElement(list, position))
  println(findKthElement(list2, position))
}