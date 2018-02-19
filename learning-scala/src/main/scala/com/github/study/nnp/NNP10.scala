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
            case z: List[Any] => flat(z, acc)
            case z => z :: acc
          }
        case x :: y => {
          x match {
            case z: List[Any] =>flat(y, flat(z, acc))
            case _ => flat(y, x :: acc)
          }
        }
      }
    }
    flat(nested, Nil).reverse
  }

  def compress(list: List[Symbol]): List[Symbol] = {
    def createCompress(target: List[Symbol], acc: List[Symbol]): List[Symbol] = {
      target match {
        case Nil => acc
        case x :: Nil => acc match {
          case Nil => x :: acc
          case a :: Nil if x != a => x :: acc
          case a :: _ if x != a => x :: acc
          case a :: _ if x == a => acc
        }
        case x :: y => createCompress(y, acc match {
          case Nil => x :: acc
          case a :: Nil if x != a => x :: acc
          case a :: _ if x != a => x :: acc
          case _ :: _ => acc
        })
      }
    }
    createCompress(list, Nil).reverse
  }

  def pack(list: List[Symbol]): List[List[Symbol]] = {
    def createPack(target: List[Symbol], acc: List[List[Symbol]]): List[List[Symbol]] = {
      target match {
        case Nil => acc
        case x :: Nil if acc.head.head == x => (x :: acc.head) :: acc.tail
        case x :: Nil => List(x) :: acc
        case x :: y if acc == Nil => createPack(y, List(x) :: acc)
        case x :: y if acc.head.head == x => createPack(y, (x :: acc.head) :: acc.tail)
        case x :: y => createPack(y, List(x) :: acc)
      }
    }
    createPack(list, Nil).reverse
  }

  def encode(list: List[Symbol]): List[(Int, Symbol)] = {
    def createEncode(target: List[Symbol], acc: List[(Int, Symbol)]): List[(Int, Symbol)] = {
      target match {
        case Nil => acc
        case x :: Nil if acc.head._2 == x => (acc.head._1 + 1, acc.head._2) :: acc.tail
        case x :: Nil => (acc.head._1 + 1, acc.head._2) :: acc.tail
        case x :: y if acc == Nil => createEncode(y, (1, x) :: acc)
        case x :: y if acc.head._2 == x => createEncode(y, (acc.head._1 + 1, acc.head._2) :: acc.tail)
        case x :: y => createEncode(y, (1, x) :: acc)
      }
    }
    createEncode(list, Nil).reverse
  }
}