package com.github.study.FizzBuzz

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
    (1 to 100).foreach(num => println( f(num) ) )
  }
}
