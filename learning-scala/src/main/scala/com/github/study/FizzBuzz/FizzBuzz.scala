package com.github.study.FizzBuzz

/**
 * Created by tamaki on 2015/02/08.
 */
object FizzBuzz {
  def main(args: Array[String]): Unit = {
    /*
1 から 100まで
3の倍数: Fizz
5の倍数: Buzz
3の倍数かつ５の倍数: FizzBuzz
それ以外 はその数字（1,2など）を出力する
    * */
    val s = (1 to 100).filterNot(_ % 2 == 0).map(x => {
      x match {
        case i if i % 15 == 0 => "FizzBuzz"
        case i if i % 3 == 0 => "Fizz"
        case i if i % 5 == 0 => "Buzz"
        case i => i
      }
    }).mkString(",")
    println(s)

    val i = (1 to 100).filterNot(_ % 2 == 0).map(x => {
      x match {
        case i if i % 15 == 0 => "FizzBuzz"
        case i if i % 3 == 0 => "Fizz"
        case i if i % 5 == 0 => "Buzz"
        case i => i
      }
    })


  }
}
