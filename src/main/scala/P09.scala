package kup.knoldus.scala99

object P09 extends App {

  def packConsecutiveDuplicate[T](list: List[T]): List[List[T]] = {

    def helper(list: List[T], res: List[List[T]]): List[List[T]] = list match {
      case head :: Nil => res :+ List(head)
      case ::(head, tail) => helper(tail.dropWhile(_ == head), res :+ tail.takeWhile(_ == head))
      case Nil => Nil
    }

    helper(list, List())
  }

  val list = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
  println(packConsecutiveDuplicate(list))

}