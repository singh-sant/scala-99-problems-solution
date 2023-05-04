package kup.knoldus.scala99

import scala.annotation.tailrec

object P18 extends App {

  def extractSlice[T](first: Int, second: Int, list: List[T]): List[T] = {
    list.slice(first, second)
  }

  def extractUsingRec[A](first: Int, second: Int, list: List[A]): List[A] = {

    if (second < first)
      throw new IllegalArgumentException

    else {
      @tailrec
      def helper(first: Int, second: Int, list: List[A], res: List[A]): List[A] = list match {
        case ::(head, next) if (first == 0 && second > 0) => helper(first, second - 1, next, res :+ head)
        case _ if (second == 0) => res
        case ::(_, next) => helper(first - 1, second, next, res)

      }

      helper(first, second - first, list, List())
    }
  }

  val list = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
  println(extractSlice(3, 7, list))
  println(extractUsingRec(3, 7, list))

}