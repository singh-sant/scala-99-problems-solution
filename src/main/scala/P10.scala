package kup.knoldus.scala99

import scala.annotation.tailrec

object P10 extends App {

  def packConsecutiveDuplicate[T](list: List[T]): List[List[T]] = {

    @tailrec
    def helper(list: List[T], res: List[List[T]]): List[List[T]] = list match {
      case ::(head, tail) => helper(tail.dropWhile(_ == head), res :+ list.takeWhile(_ == head))
      case Nil => res
    }

    helper(list, List())
  }

  def runLengthEncoding[T](list: List[List[T]]): List[(Int, T)] = {

    @tailrec
    def helper(list: List[List[T]], result: List[(Int, T)]): List[(Int, T)] = list match {
      case ::(head, tail) => helper(tail, result :+ (head.length, head.head))
      case Nil => result
    }

    helper(list, List())
  }

  val list = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")

  println(runLengthEncoding(packConsecutiveDuplicate(list)))
}