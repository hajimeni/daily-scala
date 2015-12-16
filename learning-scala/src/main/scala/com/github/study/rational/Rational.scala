package com.github.study.rational

// 分数
case class Rational(n: Int, d: Int) {
  def +(that: Rational): Rational = ???

  def <(that: Rational): Boolean = ???
  def >(that: Rational): Boolean = ???
  def <=(that: Rational): Boolean = ???
  def >=(that: Rational): Boolean = ???
}
