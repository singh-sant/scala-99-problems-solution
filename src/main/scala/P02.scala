package kup.knoldus.scala99

import scala.annotation.tailrec

object P02 extends App{

  @tailrec
  private def findSecondLastElement[T](list: List[T]): T = list match {
    case secondLast :: _ :: Nil => secondLast
    case ::(_, tail) => findSecondLastElement(tail)
    case Nil => throw new IllegalArgumentException()
  }

  val list = List(1,2,3,4,5)
  println(findSecondLastElement(list))
}