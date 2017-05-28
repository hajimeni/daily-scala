package com.github.study.btree

sealed trait Node {
  def sum: Int
  def size: Int
  def max: Int
  def min: Int
  def find(i: Int): Option[Node]
}

case class Branch(left: Node, value: Int, right: Node) extends Node {
  override def size: Int = left.size + 1 + right.size
  override def max: Int = List[Int](left.max, value, right.max).max
  override def min: Int = List[Int](left.min, value, right.min).min
  override def sum: Int = List[Int](left.sum, value, right.sum).sum
  override def find(i: Int): Option[Node] = {
    if (i == value)
      Some(this)
    else
      left.find(i) match {
        case Some(x) => Some(x)
        case _ => right.find(i) match {
          case Some(x) => Some(x)
          case _ => None
        }
      }
  }
}
case class Leaf(value: Int) extends Node {
  override def size: Int = 1
  override def max: Int = value
  override def min: Int = value
  override def sum: Int = value
  override def find(i: Int): Option[Node] =
    if (i == value) Some(this)
    else None

}

case class BTree(node: Node) {
  def max: Int = node.max
  def min: Int = node.min
  def size: Int = node.size
  def sum: Int = node.sum
  def avg: Double = node.sum / node.size
  def find(i: Int): Option[Node] = node.find(i)
}