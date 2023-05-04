package kup.knoldus.scala99

import scala.annotation.tailrec

object P21 extends App {

  def insertAtIndex[T](newEle: T, pos: Int, list: List[T]): List[T]  ={

    @tailrec
    def helper(pos: Int, list: List[T], res: List[T]): List[T] = list match {
      case rest if(pos == 0) => (res :+ newEle) ::: rest
      case ::(head, next) => helper(pos - 1, next, res :+ head)
      case Nil => res
    }

    helper(pos,list, List())
  }

  val list  = List("a","b","c","d")
  println(insertAtIndex("new",1,list))

}
