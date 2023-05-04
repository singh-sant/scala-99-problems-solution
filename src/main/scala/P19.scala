package kup.knoldus.scala99

import scala.annotation.tailrec

object P19 extends App {

  def rotate[T](num: Int, list: List[T]): List[T] = {
    if (num > 0)
      list.drop(num) ::: list.take(num)
    else if (num < 0)
      list.takeRight(Math.abs(num)) ::: list.dropRight(Math.abs(num))
    else
      list
  }

  @tailrec
  def rotateUsingRecursion[A](num: Int, list: List[A]): List[A] = list match {
    case ::(head, next) if(num != 0 && num>0) => rotateUsingRecursion(num - 1, next :+ head)
    case ::(head, next) if(num != 0 && num<0) => rotateUsingRecursion(num + 1, next.last :: head :: next.init)
    case _ => list
  }


  val list = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
  println(rotate(3, list))
  println(rotate(-2, list))
  println(rotateUsingRecursion(3, list))
  println(rotateUsingRecursion(-2, list))

}
