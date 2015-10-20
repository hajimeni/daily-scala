package com.github.study.nnp

import scala.annotation.tailrec

/**
 * Created by tamaki on 2015/02/08.
 */
trait NNP10 {

  // P01 (*) Find the last element of a list.
  def last(list: List[Int]): Int = {
    @tailrec
    def last_(list: List[Int]): Int = {
      list match{
        case head :: Nil => head
        case head :: tail => last_(tail)
      }
    }
    last_(list)
  }

  // P02 (*) Find the last but one element of a list.
  def penultimate(list: List[Int]): Int = {
    @tailrec
    def penultimate_(list: List[Int]): Int = {
      list match{
        case head :: last :: Nil => head
        case head :: tail => penultimate_(tail)
      }
    }
    penultimate_(list)
  }

  def nth(n: Int, list: List[Int]): Int = {
    @tailrec
    def nth_(acc: Int, list: List[Int]): Int = {
      acc match{
        case 0 => list.head
        case _ => nth_(acc - 1, list.tail)
      }
    }
    nth_(n, list)
  }

  def length(list: List[Int]): Int = {
    @tailrec
    def length_(acc: Int, list: List[Int]): Int = {
      list match{
        case head :: tail  => length_(acc + 1, list.tail)
        case Nil => acc
      }
    }
    length_(0, list)
  }

  def reverse(list: List[Int]): List[Int] = {
    @tailrec
    def reverse_(acc: List[Int], list: List[Int]): List[Int] = {
      list match{
        case head :: tail  => reverse_(head :: acc, list.tail)
        case Nil => acc
      }
    }
    reverse_(Nil, list)
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