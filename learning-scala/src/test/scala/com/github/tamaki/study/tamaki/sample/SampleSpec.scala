package com.github.tamaki.study.tamaki.sample

import collection.mutable.Stack
import org.scalatest._

/**
 * Created by tamaki on 2015/02/08.
 */
class SampleSpec extends FunSpec with Matchers {

  describe("A Sample") {
    it("returns hello message with specified word") {
      val sample = new Sample
      val word = "すから"
      sample.hello(word) should be(s"Hello, $word!")
    }
  }

  describe("A Stack") {
    it("should pop values in last-in-first-out order") {
      val stack = new Stack[Int]
      stack.push(1)
      stack.push(2)
      stack.pop() should be (2)
      stack.pop() should be (1)
    }

    it("should throw NoSuchElementException if an empty stack is popped") {
      val emptyStack = new Stack[String]
      a [NoSuchElementException] should be thrownBy {
        emptyStack.pop()
      }
    }
  }
}
