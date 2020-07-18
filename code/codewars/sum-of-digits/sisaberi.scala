object SumOfDigits {

    @scala.annotation.tailrec
    def digitalRoot(n: Int): Int = {
      val digits = n.toString.map(_.asDigit).toList

      if(digits.length == 1) digits.head else digitalRoot(digits.sum)
    }
 
 
}
