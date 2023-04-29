package kup.knoldus.scala99

object P08 extends App {

  def removeDuplicate[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case head :: Nil => List(head)
    case head :: tail => head :: removeDuplicate(tail.dropWhile(_ == head))
  }

  val list = List(1,2,2,2,4,5,6,6,6,6)
  println(removeDuplicate(list))
}