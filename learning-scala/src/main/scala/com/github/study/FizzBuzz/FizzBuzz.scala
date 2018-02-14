package com.github.study.FizzBuzz

/**
 * Created by tamaki on 2015/02/08.
 */
object FizzBuzz {
  def main(args: Array[String]): Unit = {

//    // その2
//    (1 to 100).map { case i if i % 15 == 0 => "FizzBuzz" case i if i % 5 == 0 => "Buzz" case i if i % 3 == 0 => "Fizz" case i => i.toString}.foreach(i => println(i))
//
//    // その3
//    (1 to 100)
//      .filter(_ % 2 != 0)
//      .collect {
//        case i if i % 15 == 0 => "FizzBuzz"
//        case i if i % 5 == 0 => "Buzz"
//        case i if i % 3 == 0 => "Fizz"
//        case i if i == 1 => i.toString
//      }.foreach(println)
//
//    // その4
//    println((1 to 100)
//      .map {
//        case i if i % 15 == 0 => "FizzBuzz"
//        case i if i % 5 == 0 => "Buzz"
//        case i if i % 3 == 0 => "Fizz"
//        case i => i.toString
//      }.mkString(","))

    // その5
    println((1 to 100)
      .map {
        case i if i % 15 == 0 => "FizzBuzz"
        case i if i % 5 == 0 => "Buzz"
        case i if i % 3 == 0 => "Fizz"
        case i => i.toString
      }.filter(i => i != "Fizz" && i != "Buzz" && i != "FizzBuzz")
      .map(i => i.toInt)
      .sum)

        // その6
//    val fizzList = List(0,0,1)
//    val BuzzList = List(0,0,0,0,1)
//    fizzList.last

    def last(list: List[Object]): Object = {
      list.last
    }

    def penultimate(list: List[Object]): Object = {
      list.reverse(1)
    }

    def nth(index: Int, list:List[Object]): Object = {
      list(index)
    }
  }
}