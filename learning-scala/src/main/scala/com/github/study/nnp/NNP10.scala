package com.github.study.nnp

import scala.annotation.tailrec

/**
 * Created by tamaki on 2015/02/08.
 */
trait NNP10 {

  // P01 (*) Find the last element of a list.
  @tailrec
  final def last(list: List[Int]): Int =
    list match {
      case head :: Nil => head
      case head :: tail => last(tail)
    }

  last(List(1, 2, 10))

  // P02 (*) Find the last but one element of a list.
  def penultimate(list: List[Int]): Int = list match {
    case head :: last :: Nil => head
    case head :: tail => penultimate(tail)
    case _ => 0
  }

  penultimate(List(1, 2, 3, 10))

  def nth(n: Int, list: List[Int]): Int =
    (n, list) match {
      case (0, head :: tail) => head
      case (_, head :: tail) => nth(n - 1, tail)
    }

  nth(2, List(1, 1, 2, 3, 5, 8))

  def length(list: List[Int]): Int = {
    def go(list: List[Int], acc: Int): Int = list match {
      case Nil => acc
      case head :: tail => go(tail, acc + 1)
    }
    go(list, 0)
  }

  length(List(1, 1, 2, 3, 5, 8))

  def reverse(list: List[Int]): List[Int] = {
    def go(list: List[Int], acc: List[Int]): List[Int] = list match {
      case Nil => acc
      case head :: tail => go(tail, head :: acc)
    }
    go(list, List.empty)
  }

  reverse(List(1, 1, 2, 3, 5, 8))

  def equalList[T](listA: List[T], listB: List[T]): Boolean =
    (listA, listB) match {
      case (Nil, Nil) => true
      case (aH :: aT, bH :: bT) if aH == bH => equalList(aT, bT)
      case (_, _) => false
    }

  def isPalindrome(list: List[Int]): Boolean =
    equalList(list, reverse(list))

  /**
   * List連結自作版
   * @param nested
   * @return
   */
  def flatten(nested: List[Any]): List[Any] = {

    @tailrec
    def concatRev(ls1: List[Any], ls2: List[Any], acc: List[Any]): List[Any] = {
      (ls1, ls2) match {
        case (Nil, Nil) => acc
        case (h :: t, ls) => concatRev(t, ls, h :: acc)
        case (Nil, h :: t) => concatRev(Nil, t, h :: acc)
      }
    }

    @tailrec
    def go(ls: List[Any], acc: List[Any]): List[Any] = {
      ls match {
        case Nil => acc
        case (h: List[Any]) :: t =>
          go(concatRev(h, t, List.empty[Any]).reverse, acc)
        case h :: t =>
          go(t, h :: acc)
      }
    }
    go(nested, List.empty[Any]).reverse
  }

  /**
   * List連結演算子利用
   * @param nested
   * @return
   */
  def flatten2(nested: List[Any]): List[Any] = {
    @tailrec
    def go(ls: List[Any], acc: List[Any]): List[Any] = {
      ls match {
        case Nil => acc
        case (h: List[Any]) :: t =>
          go(h ::: t, acc)
        case h :: t =>
          go(t, h :: acc)
      }
    }
    go(nested, List.empty[Any]).reverse
  }

  def compress(list: List[Symbol]): List[Symbol] = {
    @tailrec
    def go[T](ls: List[T], acc: List[T], last: T): List[T] = {
      ls match {
        case Nil => acc
        case h :: t if h != last =>
          go(t, acc :+ h, h)
        case h :: t =>
          go(t, acc, last)
      }
    }
    go(list, List.empty[Symbol], null)
  }

  @tailrec
  private def replaceLast[T](ls: List[T], newLast: T, acc: List[T]): List[T] =
    ls match {
      case last :: Nil =>
        acc :+ newLast
      case h :: tail =>
        replaceLast(tail, newLast, acc :+ h)
    }

  def pack(list: List[Symbol]): List[List[Symbol]] = {


    @tailrec
    def go[T](ls: List[T], acc: List[List[T]], last: T): List[List[T]] =
      ls match {
        case Nil => acc

        case h :: t if h != last =>
          go(t, acc :+ List(h), h)
        case h :: t =>
          go(t, replaceLast(acc, acc.last :+ h, List.empty[List[T]]), last)
      }

    go(list, List.empty[List[Symbol]], null)
  }

  def encode(list: List[Symbol]): List[(Int, Symbol)] = {

    def go[T](ls: List[T], acc: List[(Int, T)], countAcc: Int, key: T): List[(Int, T)] =
      ls match {
        case Nil =>
          acc :+(countAcc, key)
        case h :: t if h == key =>
          go(t, acc, countAcc + 1, key)
        case h :: t =>
          go(t, acc :+(countAcc, key), 1, h)
      }
    go(list.tail, List.empty[(Int, Symbol)], 1, list.head)
  }
}