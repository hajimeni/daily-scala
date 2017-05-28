package com.github.study.FizzBuzz

import scala.collection.immutable.IndexedSeq

/**
 * Created by tamaki on 2015/02/08.
 */
object FizzBuzz {
  def main(args: Array[String]): Unit = {

    val f = (num:Int) => {
      (num % 3 == 0,num % 5 == 0) match {
        case (true, true)  => "FizzBuzz"
        case (true, false) => "Fizz"
        case (false,true)  => "Buzz"
        case _             => num.toString
      }
    }


//    (1 to 100).withFilter(_%2 != 0).map(f(_)).mkString(",").map(println(_))

    println("-FizzBuzz以外のものを合算する-")
    println( (1 to 100).map(f(_)).withFilter(_ forall {_.isDigit}).map(_.toInt).sum)
  }
}
