package kup.knoldus.scala99

import scala.annotation.tailrec

object P04 extends App {

  private def findNumberOfElement[T](list: List[T]): Int = {
    @tailrec
    def helper(list: List[T], size: Int): Int = list match {
      case Nil => size
      case _ :: Nil => size + 1
      case ::(_, tail) => helper(tail, size + 1)
    }

    helper(list,0)
  }

  val list  = List(1,2,3,4,5)
  println(findNumberOfElement(list)) // 5
  val list2 = List()
  println(findNumberOfElement(list2)) // 0
  val list1 = List(1)
  println(findNumberOfElement(list1)) // 1
}