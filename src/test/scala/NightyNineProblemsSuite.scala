package nightynineproblems

import org.scalatest._

import NightyNineProblems._

class NightyNineProblemsSuite extends FunSuite {
  test("last") {
    assert(last(List(1, 1, 2, 3, 5, 8)) === 8)
    assert(last(List(1, 1, 2, 3, 5, 8)) != 10)
  }

  test("penultimate") {
    assert(penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
    assert(penultimate(List(1, 2, 3)) === 2)
  }

  test("nth") {
    assert(nth(2, List(1, 1, 2, 3, 5, 8)) === 2)
    assert(nth(5, List(1, 1, 2, 3, 5, 8)) === 8)
  }

  test("length") {
    assert(length(List(1, 1, 2, 3, 5, 8)) === 6)
  }

  test("reverse") {
    assert(reverse(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1))
  }
}
