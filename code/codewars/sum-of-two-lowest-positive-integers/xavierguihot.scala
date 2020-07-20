object LowIntSum {

  def sumTwoSmallest(numbers: List[Int]): Int =
    numbers.drop(2).foldLeft(numbers.take(2)) { (acc, x) => if (x < acc.max) List(x, acc.min) else acc }.sum
}
