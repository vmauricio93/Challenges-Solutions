using System;
using System.Linq;
public static class Kata
{
  public static int sumTwoSmallestNumbers(int[] numbers)
  {
    Array.Sort(numbers);
    var zalupa = numbers.Take(2).Sum();
    return zalupa;
  }
}
