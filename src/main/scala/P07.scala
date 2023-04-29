package kup.knoldus.scala99

object P07 extends App {

  def flatten(list: List[Any]): List[Any]  = list match {
    case (head: List[Any]) :: tail => flatten(head) ::: flatten(tail)
    case head :: tail => head :: flatten(tail)
    case Nil => Nil
  }

  val list = List(List(1, 1), 2, List(3, List(5, 8)))
  val list2 = List(1,2,3,4)
  println(flatten(list))
  println(flatten(list2))
}