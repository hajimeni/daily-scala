package com.github.study.nnp

/**
 * Created by tamaki on 2015/02/08.
 */
trait NNP10 {

  // P01 (*) Find the last element of a list.
  def last(list: List[Int]): Int = {
    list match {
      case x :: Nil => x
      case _ :: y => last(y)
    }
  }

  // P02 (*) Find the last but one element of a list.
  def penultimate(list: List[Int]): Int = {
    list match {
      case x :: _ :: Nil => x
      case _ :: y :: z => penultimate(y :: z)
//      case _ =>
    }
  }

  def nth(n: Int, list: List[Int]): Int = {
    list match {
      case x :: _ if n == 0 => x
      case _ :: y if n > 0 => nth(n - 1, y)
    }
  }

  def length(list: List[Int]): Int = {
    def count(list: List[Int], acc: Int): Int = {
      list match {
        case _ :: Nil => acc + 1
        case _ :: y => count(y,acc+1)
      }
    }
    count(list, 0)
  }

  def reverse(list: List[Int]): List[Int] = {
    def createReverse(list: List[Int], acc: List[Int]): List[Int] = {
      list match {
        case x :: Nil => x :: acc
        case x :: y => createReverse(y, x :: acc)
      }
    }
    createReverse(list, Nil)
  }

  def isPalindrome(list: List[Int]): Boolean = {
    reverse(list) == list
  }

  def flatten(nested: List[Any]): List[Any] = {
  }

  def compress(list: List[Symbol]): List[Symbol] = {
    ???
  }

  def pack(list: List[Symbol]): List[List[Symbol]] = {
    ???
  }

  def encode(list: List[Symbol]): List[(Int, Symbol)] = {
    ???
  }
}