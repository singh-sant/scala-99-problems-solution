package kup.knoldus.scala99

import org.graalvm.compiler.core.common.util.ReversedList

object P05 extends App {


  def reverseList[T](list: List[T]): List[T] = list match {
    case Nil => list
    case _ :: Nil => list
    case ::(head, tail) => reverseList(tail) ::: List(head)
  }

  val list = List(1, 2, 3, 4, 5)
  val list2 = List()
  println(reverseList(list))
  println(reverseList(list2))
}