package kup.knoldus.scala99

object P14 extends App{

  def duplicateElement[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case ::(head, tail) => head :: head :: duplicateElement(tail)
  }

  val list = List('a', 'b', 'c', 'c', 'd')
  println(duplicateElement(list))
}