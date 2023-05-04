package kup.knoldus.scala99

object P25 extends App {

  def randomPermute[T](list: List[T]): List[T] = {
    extractElements(list.length,list)
  }

  def removeKthElement[A](num: Int, list: List[A]): (List[A], A) = {
    def helper(index: Int, list: List[A], res: List[A]): (List[A], A) = list match {
      case ::(head, next) if(index == 0) => (res ::: next, head)
      case ::(head, next) => helper(index - 1, next, res:+head)
      case Nil => throw new IllegalArgumentException
    }

    helper(num, list, List())
  }

  def extractElements[B](num: Int, list: List[B]): List[B] = {
    if(num == 0) Nil
    else {
      val (rest, element) = removeKthElement(util.Random.nextInt(list.length), list)
      element :: extractElements(num - 1, rest)
    }
  }


  val list = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')
  println(randomPermute(list))
  println(removeKthElement(1,list))
  println(extractElements(3, list))


}
