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
        case Nil => throw new IllegalArgumentException
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
        case Nil => throw new IllegalArgumentException
        case head :: last :: Nil => head
        case head :: tail => penultimate_(tail)
      }
    }
    penultimate_(list)
  }

  def nth(n: Int, list: List[Int]): Int = {
    @tailrec
    def nth_(list: List[Int]): Int = {
      list match{
        case Nil => throw new IllegalArgumentException
        case head :: Nil => head
        case head :: tail => nth_(tail)
      }
    }
    nth_(list.view(0, n + 1).toList)
  }

  def length(list: List[Int]): Int = {
    @tailrec
    def length_(acc: Int, list: List[Int]): Int = {
      list match{
        case head :: tail  => length_(acc + 1, tail)
        case Nil => acc
      }
    }
    length_(0, list)
  }

  def reverse(list: List[Int]): List[Int] = {
    @tailrec
    def reverse_(acc: List[Int], list: List[Int]): List[Int] = {
      list match{
        case head :: tail  => reverse_(head :: acc, tail)
        case Nil => acc
      }
    }
    reverse_(Nil, list)
  }

  def isPalindrome(list: List[Int]): Boolean = {
    @tailrec
    def isPalindrome_(list: List[Int]): Boolean = {
      list match{
        case Nil => throw new IllegalArgumentException
        case head :: Nil => true
        case head :: tail if head == tail.reverse.head  => isPalindrome_(tail.reverse.tail)
      }
    }
    isPalindrome_(list)
  }

  def flatten(nested: => List[Any]): List[Any] = {
    @tailrec
    def flatten_(acc: => List[Any], list: List[Any]): List[Any] = {
      list match{
        case (head: Int) :: tail => flatten_(acc :+ head, tail)
        case (head: List[_]) :: tail => flatten_(acc ::: flatten(head), tail)
        case head :: tail => throw new IllegalArgumentException
        case Nil => acc
      }
    }
    flatten_(Nil, nested)
  }

  def compress(list: List[Symbol]): List[Symbol] = {
    @tailrec
    def compress_(acc: List[Symbol], list: List[Symbol]): List[Symbol] = {
      list match{
        case head :: tail if acc.nonEmpty && head == acc.head  => compress_(acc, tail)
        case head :: tail => compress_(head :: acc, tail)
        case Nil => acc.reverse
      }
    }
    compress_(Nil, list)
  }

  def pack(list: List[Symbol]): List[List[Symbol]] = {
    @tailrec
    def pack_(acc: List[List[Symbol]], tmpAcc: List[Symbol], list: List[Symbol]): List[List[Symbol]] = {
      list match{
        case head :: tail if tmpAcc.nonEmpty && head != tmpAcc.head  => pack_(tmpAcc :: acc, head :: Nil, tail)
        case head :: tail => pack_(acc, head :: tmpAcc, tail)
        case Nil => (tmpAcc :: acc).reverse
      }
    }
    pack_(Nil, Nil, list)
  }

  def encode(list: List[Symbol]): List[(Int, Symbol)] = {
    @tailrec
    def encode_(acc: List[(Int, Symbol)], list: List[Symbol], tmpAcc: Option[(Int, Symbol)] = None): List[(Int, Symbol)] = {
      list match{
        case head :: tail if tmpAcc.nonEmpty && Option(head) != tmpAcc.map(_._2) => encode_(tmpAcc.get :: acc, tail, Option((1, head)))
        case head :: tail => encode_(acc, tail, tmpAcc.map(t => (t._1 + 1, head)).orElse(Option((1, head))))
        case Nil => tmpAcc.map(t => (t :: acc).reverse).getOrElse(Nil)
      }
    }
    encode_(Nil, list)
  }
}