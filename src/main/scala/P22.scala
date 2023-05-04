package kup.knoldus.scala99

import scala.annotation.tailrec

object P22 extends App {

  def createList(start: Int, end: Int): List[Int] = {
    (start to end).toList
  }

  def createListUsingRec(start: Int, end: Int): List[Int] = {
    @tailrec
    def helper(start: Int, res: List[Int]): List[Int] = {
      if (start > end) res
      else helper(start + 1, res :+ start)
    }

    helper(start, List())
  }

  println(createList(4, 9))
  println(createListUsingRec(4, 9))
}