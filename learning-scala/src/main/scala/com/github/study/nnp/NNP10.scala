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
      case _ => sys.error("不正な値です。")
    }
  }

  // P02 (*) Find the last but one element of a list.
  def penultimate(list: List[Int]): Int = {
    list match {
      case x :: _ :: Nil => x
      case _ :: y :: z => penultimate(y :: z)
      case _ => sys.error("不正な値です。")
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
        case Nil => Nil
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
    def flat(target: List[Any], acc: List[Any]): List[Any]= {
      target match {
        case Nil => acc
        case x :: Nil =>
          x match {
            case x: List[Any] => flat(x, acc)
            case x => x :: acc
          }
        case x :: y => {
          x match {
            case x: List[Any] => {
              flat(y, flat(x, acc))
            }
            case x => flat(y, x :: acc)
          }
        }
      }
    }
    flat(nested, Nil).reverse
  }

  def compress(list: List[Symbol]): List[Symbol] = {
    def createCompress(target: List[Symbol], compress: List[Symbol]): List[Symbol] = {
      target match {
        case Nil => compress
        case x :: Nil => compress match {
          case Nil => x :: compress
          case a :: Nil if x != a => x :: compress
          case a :: b if x != a => x :: compress
          case a :: b if x == a => compress
        }
        case x :: y => createCompress(y, compress match {
          case Nil => x :: compress
          case a :: Nil if x != a => x :: compress
          case a :: b if x != a => x :: compress
          case _ :: b => compress
        })
      }
    }
    createCompress(list, Nil).reverse
  }

  def pack(list: List[Symbol]): List[List[Symbol]] = {
    ???
  }

  def encode(list: List[Symbol]): List[(Int, Symbol)] = {
    ???
  }
}