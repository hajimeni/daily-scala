package com.github.study.btree

/**
 * Created by shintaro.tamaki on 2015/10/29.
 */
sealed trait Node {
  def size: Int
  def max: Int
  def min: Int
  def sum: Int
  def find(value: Int): Option[Node]
}
case class Branch(left: Node, value: Int, right: Node) extends Node {
  def size: Int = left.size + 1 + right.size
  def max: Int = Math.max(left.max, Math.max(value, right.max))
  def min: Int = Math.min(left.min, Math.min(value, right.min))
  def sum: Int = left.sum + value + right.sum
  def find(_value: Int): Option[Node] = value == _value match {
    case true => Some(this.copy())
    case false => left.find(_value).orElse(right.find(_value))
  }
}
case class Leaf(value: Int) extends Node {
  def size: Int = 1
  def max = value
  def min = value
  def sum = value
  def find(_value: Int): Option[Node] = _value == value match {
    case true => Some(this.copy())
    case false => None
  }
}
case class BTree(node: Node) {
  def size = node.size

  def max = node.max

  def min = node.min

  def sum = node.sum

  def avg = node.sum / node.size

  def find(value: Int) = node.find(value)
}
