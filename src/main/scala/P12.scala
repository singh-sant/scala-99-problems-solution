package kup.knoldus.scala99

import scala.annotation.tailrec

object P12 extends App {

  def decode[T](list: List[(Int, T)]): List[T] = {

    @tailrec
    def addItemInList(num: Int, item: T, list: List[T]): List[T] = {
      if (num > 0) addItemInList(num - 1, item, list :+ item)
      else list
    }

    list.flatMap(tuple => addItemInList(tuple._1, tuple._2, List()))
  }

//  def decodeUsingInBuilt[A](ls: List[(Int, A)]): List[A] =
//    ls flatMap { e => List.make(e._1, e._2) }

  val list = List((4, "a"), (1, "b"), (2, "c"), (2, "a"), (1, "d"), (4, "e"))
  println(decode(list))
}