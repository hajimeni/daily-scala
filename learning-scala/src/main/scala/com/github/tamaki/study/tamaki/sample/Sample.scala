package com.github.tamaki.study.tamaki.sample

import java.util

/**
 * Created by tamaki on 2015/02/08.
 */
class Sample {
  def hello(word: String): String = {
    s"Hello, $word!"
  }


  def fuga = {
    Option(new util.HashMap[String, String]().get("key")).foreach(println)
  }

}
