package kup.knoldus.scala99

import scala.annotation.tailrec

object P20 extends App {

  def removeKthElement[T](pos: Int, list: List[T]): (List[T], T) = {

    @tailrec
    def helper(pos: Int, list: List[T], res: List[T]): (List[T], T) = list match {
      case ::(head, next) if (pos == 0) => (res ::: next, head)
      case ::(head, next) => helper(pos - 1, next, res :+ head)
      case Nil => throw new NoSuchElementException
    }

    helper(pos, list, List())
  }

  val list = List('a','b','c','d')
  println(removeKthElement(3, list))
}