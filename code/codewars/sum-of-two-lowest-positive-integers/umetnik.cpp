#include <algorithm>

unsigned int sumTwoSmallestNumbers(std::vector<int> numbers)
{
  std::nth_element(begin(numbers), next(begin(numbers)), end(numbers));
  return (unsigned int)(numbers[0] + numbers[1]);
}
