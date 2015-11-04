package com.github.study.btree

sealed trait Node {
  def size: Int
  def max: Int
  def min: Int
  def avg: Int
}

case class Branch(left: Node, value: Int, right: Node) extends Node {
  override def size: Int = left.size + 1 + right.size

  override def max: Int = List[Int](left.max, value, right.max).max

  override def min: Int = List[Int](left.min, value, right.min).min

  override def avg: Double = (left.avg + value + right.avg) / 3
}

case class Leaf(value: Int) extends Node {
  override def size: Int = 1

  override def max: Int = value

  override def min: Int = value

  override def avg: Int = value
}

case class BTree(node: Node) {
  def max: Int = node.max
  def min: Int = node.min
  def size: Int = node.size
  def avg: Int = node.avg
}