package kup.knoldus.scala99

import scala.annotation.tailrec

object P16 extends App {

  def dropNthElement[A](pos: Int, list: List[A]): List[A] = {
    list.zipWithIndex.filter(tuple => (tuple._2 + 1) % pos != 0).map(_._1)
  }

  def dropUsingRecursion[T](pos: Int, list: List[T]): List[T] = {

    def helper(index: Int, list: List[T]): List[T] = list match {
      case Nil => Nil
      case ::(_, tail) if (index == 1) => helper(pos, tail)
      case ::(head, tail) => head :: helper(index - 1, tail)
    }

    helper(pos, list)
  }

  def dropUsingTail[B](pos: Int, list: List[B]): List[B] = {

    @tailrec
    def dropT(index: Int, list: List[B], res: List[B]): List[B] = list match {
      case Nil => res
      case ::(_, tail) if (index == 1) => dropT(pos, tail, res)
      case ::(head, tail) => dropT(index - 1, tail, res :+ head)
    }

    dropT(pos, list, List())
  }

  val list = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
  println(dropNthElement(3, list))
  println(dropUsingRecursion(3, list))
  println(dropUsingTail(3, list))
}