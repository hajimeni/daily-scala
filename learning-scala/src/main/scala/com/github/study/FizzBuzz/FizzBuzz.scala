package com.github.study.FizzBuzz

/**
  * Created by tamaki on 2015/02/08.
  */
object FizzBuzz {
  def main(args: Array[String]): Unit = {

    // p1
    // p2
    // p3
    // p4
    // p5
    // p6

  }

  // 1 から 100まで
  // 3の倍数: Fizz
  // 5の倍数: Buzz
  // 3の倍数かつ５の倍数: FizzBuzz
  // それ以外 はその数字（1,2など）を出力する
  def p1 = {
    val list = 1 to 100
    list.map(i => {
      var output = ""
      if (i % 3 == 0) {
        output += "Fizz"
      }
      if (i % 5 == 0) {
        output += "Buzz"
      }
      if (i % 3 != 0 && i % 5 != 0) {
        output = i.toString
      }
      println(output)
    })
  }

  // 1行で書く
  def p2 = {
    (1 to 100).map { case i if i % 3 == 0 && i % 5 == 0 => "FizzBuzz" case i if i % 3 == 0 => "Fizz" case i if i % 5 == 0 => "Buzz" case i => i.toString }.foreach(i => println(i))
  }

  // 2の倍数は除外する
  def p3 = {
    (1 to 100).filter(_ % 2 != 0).map(i => {
      i match {
        case i if i % 3 == 0 && i % 5 == 0 => "FizzBuzz"
        case i if i % 3 == 0 => "Fizz"
        case i if i % 5 == 0 => "Buzz"
        case _ => i.toString
      }
    }).foreach(println)
  }

  // １行ずつ表示をやめる
  // カンマ区切りで１行で出す
  def p4 = {
    val result = (1 to 100).map(i => {
      i match {
        case i if i % 3 == 0 && i % 5 == 0 => "FizzBuzz"
        case i if i % 3 == 0 => "Fizz"
        case i if i % 5 == 0 => "Buzz"
        case _ => i.toString
      }
    }).mkString(",")

    println(result)
  }

  def p5 = {
    // その5
    //        val list = (1 to 100).map(i => {
    //          i match {
    //            case i if i % 3 == 0 && i % 5 == 0 => "FizzBuzz"
    //            case i if i % 3 == 0 => "Fizz"
    //            case i if i % 5 == 0 => "Buzz"
    //            case _ => i.toString
    //          }
    //        }).filter(f => f.matches("^[0-9]+$")).map(m => m.toInt).sum
    //
    //        println(list)

    // その5 パターン2
    val list = (1 to 100).map(i => {
      i match {
        case i if i % 3 == 0 && i % 5 == 0 => "FizzBuzz"
        case i if i % 3 == 0 => "Fizz"
        case i if i % 5 == 0 => "Buzz"
        case _ => i
      }
    }).collect { case j: Int => j }.sum

    println(list)
  }

  def p6 = {
    f.foreach(println)
  }


  def f: List[String] = {
    def _loop(i: Int, acc: List[String]): List[String] = i match {
      case _ if i > 100 => acc.reverse
      case _ => {
        val x =
          i match {
            case i if i % 3 == 0 && i % 5 == 0 => "FizzBuzz"
            case i if i % 3 == 0 => "Fizz"
            case i if i % 5 == 0 => "Buzz"
            case _ => i.toString
          }
        _loop(i + 1, x :: acc)
      }
    }
    // start
    _loop(1, Nil)
  }
}

