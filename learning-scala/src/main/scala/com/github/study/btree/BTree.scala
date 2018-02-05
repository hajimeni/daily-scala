package com.github.study.btree

/**
 * Created by shintaro.tamaki on 2015/10/29.
 */
sealed trait Node {
  def size: Int
}

case class Leaf(value: Int) extends Node {
  def size: Int = ???
}

case class Branch(left:  Node, value: Int, right: Node) extends Node {
  def size: Int = ???
}

case class BTree(node: Node) {
  def size: Int = ???
  def max: Int = ???
  def min: Int = ???
  def avg: Int = ???
  def sum: Int = ???
}

object BTree {
  def apply(list: List[Int]): BTree = ???
}

