package com.github.tamaki.study.tamaki.sample

/**
 * Created by tamaki on 2015/02/08.
 */
object SampleMain {

  def main(args: Array[String]): Unit = {
    println("hello World!")
    val s = "すから"
    println(s"hello $s")

    sample()
    sample(10)

    println(sampleCase("a"))
    println(sampleCase(1))
    println(sampleCase(10000L))
    println(sampleCase(1.5d))
    println(sampleCase(1.5f))
  }

  def sample (num: Int = 1) {
    println(s"num=[$num]")
  }

  def sampleCase (in: Any) : String = {
    in match {
      case x: String => s"String=[$x]"
      case y: Int    => s"Int=[${y.toString}]"
      case z: Long   => s"Long=[${z.toString}]"
      case _  => "Any"
    }
  }

}
