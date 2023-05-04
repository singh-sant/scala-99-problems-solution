package kup.knoldus.scala99

import scala.annotation.tailrec

object P17 extends App {

  def splitIntTwoParts[T](length: Int, list: List[T]): (List[T], List[T]) = {
    list.splitAt(length)
  }

  def splitUsingRec[A](length: Int, list: List[A]): (List[A], List[A]) = {

    @tailrec
    def helper(length: Int, list: List[A], res: (List[A], List[A])): (List[A], List[A]) = list match {
      case ::(head, next) if (length > 0) => helper(length - 1, next, (res._1 :+ head, res._2))
      case rest => (res._1, res._2 ::: rest)
      case Nil => res
    }

    helper(length, list, (List(), List()))
  }


  val list = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
  println(splitIntTwoParts(3, list))
  println(splitUsingRec(3, list))

}
