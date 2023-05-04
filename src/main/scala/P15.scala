package kup.knoldus.scala99

import scala.annotation.tailrec

object P15 extends App {

  def duplicateN[T](times: Int, list: List[T]): List[T] = {

    @tailrec
    def duplicate(list: List[T], res: List[T]): List[T] = list match {
      case ::(head, tail) => duplicate(tail, addItemInList(times, head, res))
      case Nil => res
    }

    @tailrec
    def addItemInList(num: Int, item: T, list: List[T]): List[T] = {
      if (num > 0) addItemInList(num - 1, item, list :+ item)
      else list
    }

    duplicate(list, List())
  }

  val list = List('a', 'b', 'c', 'c', 'd')
  val times = 3
  println(duplicateN(times, list))
}