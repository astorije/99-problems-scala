package nightynineproblems

object NightyNineProblems {

  // Finds the last element of a list
  def last(l: List[Int]): Int = l match {
    case h :: Nil => h
    case _ :: t   => last(t)
    case _        => throw new NoSuchElementException
  }

  // Finds the last but one element of a list
  def penultimate(l: List[Int]): Int = l match {
    case h :: _ :: Nil => h
    case _ :: t      => penultimate(t)
    case _           => throw new NoSuchElementException
  }

  // Finds the Kth element of a list
  def nth(n: Int, l: List[Int]): Int = l match {
    case h :: _ if n == 0 => h
    case _ :: t           => nth(n - 1, t)
    case _                => throw new NoSuchElementException
  }

  // Finds the number of elements of a list
  def length(l: List[Int]): Int = l match {
    case Nil      => 0
    case _ :: t   => 1 + length(t)
  }

  // Reverses a list
  def reverse(l: List[Int]): List[Int] = l match {
    case Nil => Nil
    case h :: t => reverse(t) ::: List(h)
  }
}
