package com.github.study.btree

/**
 * Created by shintaro.tamaki on 2015/10/29.
 */
sealed trait Node {
  def size: Int
}

case class Leaf(value: Int) extends Node {
  def size: Int = 1
}

case class Branch(left:  Node, value: Int, right: Node) extends Node {
  def size: Int = left.size + 1 + right.size
}

case class BTree(node: Node) {
  def size: Int = node.size
}
