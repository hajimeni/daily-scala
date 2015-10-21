package com.github.study.nnp

import scala.annotation.tailrec

/**
 * Created by tamaki on 2015/02/08.
 */
trait NNP10 {

  // P01 (*) Find the last element of a list.
  def last(list: List[Int]): Int = {
    //list.last

    @tailrec
    def _last(list: List[Int]): Int = {
      list match {
        case Nil => throw new IllegalArgumentException
        case head :: Nil => head
        case head :: tail => _last(tail)
      }
    }
    _last(list)
  }

  // P02 (*) Find the last but one element of a list.
  def penultimate(list: List[Int]): Int = {
    //    list.takeRight(2).head
    @tailrec
    def penultimate_(list: List[Int]): Int = {
      list match {
        case Nil => throw new IllegalArgumentException
        case head :: tail :: Nil => head
        case head :: tail => penultimate_(tail)
      }
    }
    penultimate_(list)
  }


  def nth(n: Int, list: List[Int]): Int = {
    //list.apply(n)

    @tailrec
    def nth_(acc:Int,list:List[Int]):Int ={

      acc match{
        case 0 => list.head
        case _ => nth_(acc - 1,list.tail)
      }

    }

    nth_(n,list)
  }

  def length(list: List[Int]): Int = {

    @tailrec
    def length_(list:List[Int],acc:Int):Int={

      list match{
        case Nil => acc
        case head :: tail=> length_(tail,acc+1)
      }
    }
    length_(list,0)
  }

  def reverse(list: List[Int]): List[Int] = {

    @tailrec
    def reverse_(list:List[Int],acc:List[Int]):List[Int]={
      list match{
        case Nil => acc
        case head :: tail => reverse_(tail,head :: acc)
      }
    }
    reverse_(list,List.empty)
  }

  def isPalindrome(list: List[Int]): Boolean = {
    list == reverse(list)
  }

  def flatten(nested: List[Any]): List[Any] = {
    ???
  }

  def compress(list: List[Symbol]): List[Symbol] = {

    @tailrec
    def compress_(list:List[Symbol],acc:List[Symbol]):List[Symbol] ={
      list match {
        case Nil => acc
        case head :: tail if (acc.isEmpty || head != acc.head) => compress_(tail,  head::acc)
        case head :: tail   => compress_(tail,acc)
      }
    }
     compress_(list,List.empty).reverse
  }

  def pack(list: List[Symbol]): List[List[Symbol]] = {
    @tailrec
    def pack_(list:List[Symbol],innerAcc:List[Symbol],acc:List[List[Symbol]]):List[List[Symbol]] ={
      (list,innerAcc) match {
        case (Nil,Nil) => throw new IllegalArgumentException
        case (Nil,_)                                    => innerAcc::acc
        case (head :: tail,Nil)                         => pack_(tail, List(head),acc)
        case (head :: tail,_) if(innerAcc.head == head) => pack_(tail, head::innerAcc,acc)
        case (head :: tail,_) if(innerAcc.head != head) => pack_(tail, List(head),innerAcc::acc)
      }
    }
    pack_(list,List.empty,List.empty).reverse

  }

  def encode(list: List[Symbol]): List[(Int, Symbol)] = {
    @tailrec
    def encode_(list:List[Symbol],count:Int,current:Symbol,acc:List[(Int,Symbol)]):List[(Int,Symbol)] ={
      list match {
        case (Nil)                              => (count,current)::acc
        case (head :: tail) if(current == head) => encode_(tail, count + 1,head,acc)
        case (head :: tail) if(current == null) => encode_(tail, 1,head,acc)
        case (head :: tail)                     => encode_(tail, 1,head,(count,current)::acc)
      }
    }
    encode_(list,0,null,List.empty).reverse
  }

}