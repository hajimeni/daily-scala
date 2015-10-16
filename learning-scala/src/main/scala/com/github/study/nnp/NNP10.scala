package com.github.study.nnp

/**
 * Created by tamaki on 2015/02/08.
 */
trait NNP10 {

  // P01 (*) Find the last element of a list.
  def last(list: List[Int]): Int = {
    def go(ls: List[Int]): Int = {
      ls match {
        case last :: Nil => last
        case h :: t => go(t)
        case _ => throw new IllegalArgumentException
      }
    }
    go(list)
  }

  // P02 (*) Find the last but one element of a list.
  def penultimate(list: List[Int]): Int = {
    ???
  }

  def nth(n: Int, list: List[Int]): Int = {
    ???
  }

  def length(list: List[Int]): Int = {
    ???
  }

  def reverse(list: List[Int]): List[Int] = {
    ???
  }

  def isPalindrome(list: List[Int]): Boolean = {
    ???
  }

  def flatten(nested: List[Any]): List[Any] = {
    ???
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