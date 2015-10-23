package com.github.study.nnp

import scala.annotation.tailrec

/**
 * Created by tamaki on 2015/02/08.
 */
trait NNP10 {

  // P01 (*) Find the last element of a list.
  def last(list: List[Int]): Int = {
    @tailrec
    def loop(list: List[Int]): Int = {
      list match {
        case x :: Nil => x
        case x :: xs => loop(xs)
      }
    }
    loop(list)
  }

  // P02 (*) Find the last but one element of a list.
  def penultimate(list: List[Int]): Int = {
//    list.reverse.tail.head
    @tailrec
    def loop(list: List[Int]): Int = {
      list match {
        case x :: xs :: Nil => x
        case x :: xs :: xss => loop(xs :: xss)
      }
    }
    loop(list)
  }

  def nth(n: Int, list: List[Int]): Int = {
    list.drop(n).head

//    @tailrec
//    def loop(list: List[Int]) = {
//
//    }


  }

  def length(list: List[Int]): Int = {
//    list.length

    @tailrec
    def loop(list: List[Int], count: Int = 0): Int = {
      list match {
        case x :: Nil => count
        case x :: xs => loop(xs, count + 1)
      }
    }

    loop(list)

  }

  def reverse(list: List[Int]): List[Int] = {
    list.reverse


  }

  def isPalindrome(list: List[Int]): Boolean = {
    list == list.reverse
  }

  def flatten(nested: List[Any]): List[Any] = {
//    flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should be (List(1, 1, 2, 3, 5, 8))
    @tailrec
    def loop(nested: List[Any], flatList: List[Any]): List[Any] = {
      nested match {
        case Nil => flatList.reverse
        case (x: Int) :: y => {
          println(s"[A]x: $x, y: $y")
          println(s"[A]x :: flatList => ${x :: flatList}")
          loop(y, x :: flatList)
        }
        case (x: List[Int]) :: y => {
          println(s"[B]x: $x, y: $y")
          println(s"[B]x ::: y => ${x ::: y}")
          loop(x ::: y, flatList)
        }

      }
    }
    loop(nested, List.empty)
  }


  def compress(list: List[Symbol]): List[Symbol] = {
    def loop(list: List[Symbol], distinctList: List[Symbol]): List[Symbol] = {
      list match {
        case x :: xs => distinctList
      }
    }
    loop(list, List())
  }

  def pack(list: List[Symbol]): List[List[Symbol]] = {
    ???
  }

  def encode(list: List[Symbol]): List[(Int, Symbol)] = {
    ???
  }

}