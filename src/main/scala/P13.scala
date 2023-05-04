package kup.knoldus.scala99

import scala.annotation.tailrec

object P13 extends App {

  def encode[T](list: List[T]): List[(Int, T)] = {

    @tailrec
    def helper(list: List[T], res: List[(Int, T)]): List[(Int, T)] = list match {
      case ::(head, tail) => helper(tail.dropWhile(_ == head), res :+ (list.takeWhile(_ == head).length, head))
      case Nil => res
    }

    helper(list, List())
  }

  def encodeUsingSpan[T](list: List[T]): List[(Int, T)] = {
    if (list.isEmpty) Nil
    else {
      val (packed, rest) = list.span(_ == list.head)
      (packed.length, packed.head) :: encode(rest)
    }
  }

  val list = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
  println(encode(list))
  println(encodeUsingSpan(list))
}