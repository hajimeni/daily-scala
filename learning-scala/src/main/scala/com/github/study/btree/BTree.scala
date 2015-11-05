package com.github.study.btree

/**
 * Created by shintaro.tamaki on 2015/10/29.
 */
sealed trait Node {
  def size: Int
  def max: Int
  def value:Int
  def min:Int
  def sum:Int
  def ave: Double = {this.sum/this.size}
  def find(v:Int):Option[Node]

  def max_(a:Int,b:Int):Int ={
    if(a > b) a else b
  }
  def min_(a:Int,b:Int):Int ={
    if(a < b) a else b
  }

}

case class Leaf(value: Int) extends Node {
  def size: Int = 1
  def max:Int  = value
  def min:Int  = value
  def sum:Int  = value
  def find(v:Int):Option[Node]={if(v==value) Some(this) else None}

}

case class Branch(left:  Node, value: Int, right: Node) extends Node {
  def size: Int = left.size + 1 + right.size
  def max:Int =  max_(value,max_(left.max,right.max))
  def min:Int =  min_(value,min_(left.min,right.min))
  def sum:Int = value + left.sum + right.sum
  def find(v:Int):Option[Node]= {
    if (v == value) Some(this)
    else if (v < value && left != None) left.find(v)
    else if (v > value && left != right) right.find(v)
    else None
  }
}

case class BTree(node: Node) {
  def size: Int = node.size
  def max: Int = node.max
  def min: Int = node.min
  def sum: Int = node.sum
  def ave: Double = {this.sum/this.size}
  def find(v:Int):Option[Node]=node.find(v)

}
