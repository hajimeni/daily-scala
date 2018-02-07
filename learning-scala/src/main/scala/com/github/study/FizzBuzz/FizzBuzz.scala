package com.github.study.FizzBuzz

/**
 * Created by tamaki on 2015/02/08.
 */
object FizzBuzz {
  def main(args: Array[String]): Unit = {
    {1 to 100}
        .collect { case i if i % 15 == 0 => "FizzBuzz"; case i if i % 5 == 0 => "Buzz" case i if i % 3 == 0 => "Fizz" case i => i}
        .foreach(i => println(i))
  }
}
