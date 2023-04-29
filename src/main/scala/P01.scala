package kup.knoldus.scala99

import scala.annotation.tailrec

object P01 extends App{

  @tailrec
  private def findLastElement[T](list: List[T]): T = list match {
    case head :: Nil => head
    case ::(_, tail) => findLastElement(tail)
    case Nil => throw new IllegalStateException()
  }

  val list = List(1, 2, 3, 4, 5)
  println(findLastElement(list))
}