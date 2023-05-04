package kup.knoldus.scala99

import scala.annotation.tailrec

object P28 extends App {

  @tailrec
  def sortingListOfList[T](list: List[List[T]]): List[List[T]] = {
    def lsort(list: List[List[T]]): List[List[T]] = list match {
      case first :: second :: tail if (first.length > second.length) => second +: lsort(first +: tail)
      case first :: tail => first +: lsort(tail)
      case Nil => Nil
    }

    val sortedList = lsort(list)
    if (sortedList == list) sortedList
    else sortingListOfList(sortedList)
  }

  val list = List(List('a', 'b', 'c'), List('d', 'e'), List('f', 'g', 'h'), List('d', 'e'), List('i', 'j', 'k', 'l'), List('m', 'n'), List('o'))
  println(sortingListOfList(list))
}