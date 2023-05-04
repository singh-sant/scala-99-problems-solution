package kup.knoldus.scala99


object P23 extends App {

  def randomSelect[T](num: Int, list: List[T]): List[T] = {
    def helper(num: Int, list: List[T], random: util.Random): List[T] = {
      if (num == 0) Nil
      else {
        val (rest, element) = P20.removeKthElement(random.nextInt(list.length), list)
        element :: helper(num - 1, rest, random)
      }
    }

    helper(num, list, util.Random)
  }

  val list = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')
  println(randomSelect(3, list))
}