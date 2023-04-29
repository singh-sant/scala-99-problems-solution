package kup.knoldus.scala99

object P06 extends App {

  private def isPalindrome[T](list: List[T]): Boolean = {
    def findReverse(list: List[T]): List[T] = list match {
      case Nil => list
      case head :: tail => findReverse(tail) ::: List(head)
    }

    if (list.equals(findReverse(list))) true else false
  }

  val list = List(1,2,3,2,1)
  println(isPalindrome(list))

  val list1 = List(1,2,3,4,5)
  println(isPalindrome(list1))

  val emptyList = List()
  println(isPalindrome(emptyList))
}