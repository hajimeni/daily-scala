import scala.annotation.tailrec

sealed trait Node {
  def size: Int
}
case class Branch(left: Node, value: Int, right: Node) extends Node {
  def size: Int = left.size + 1 + right.size
}
case class Leaf(value: Int) extends Node {
  def size: Int = 1
}
case class BTree(node: Node) {
  def size = node.size

  def max = {
    @tailrec
    def loop(node: Node): Node = {
      node match {
        case b: Branch => loop(b.right)
        case l: Leaf => l
      }
    }

    loop(node)
  }
}

val bTree1 = BTree(Leaf(1))
val bTree2 = BTree(Branch(Leaf(1), 2, Leaf(3)))
val bTree3 = BTree(Branch(Branch(Leaf(1), 2, Leaf(3)), 4, Branch(Leaf(5), 6, Leaf(7))))


bTree2.max
bTree3.max