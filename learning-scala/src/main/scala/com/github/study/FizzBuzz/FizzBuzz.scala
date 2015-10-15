package com.github.study.FizzBuzz

/**
 * Created by tamaki on 2015/02/08.
 */
object FizzBuzz {

  def main(args: Array[String]): Unit = {
    println(fizzBuzz01(1 to 100))
    println(fizzBuzz02(1 to 100))
  }

  def fizzBuzz01(list: Seq[Int]): Seq[String] =
    list.map(toFizzBuzz)

  def fizzBuzz02(list: Seq[Int]): Seq[String] =
    list.filter(_ % 2 != 0).map(toFizzBuzz)

  private def toFizzBuzz(x: Int) = (x % 3, x % 5) match {
    case (0, 0) => "FizzBuzz"
    case (0, _) => "Fizz"
    case (_, 0) => "Buzz"
    case _ => x.toString
  }

}
