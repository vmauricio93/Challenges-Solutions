function sumTwoSmallestNumbers(numbers) {  
  var smallestNumber = 0,
      secondSmallest = 0;
  
  smallestNumber = Math.min(numbers[0], numbers[1]);
  secondSmallest = Math.max(numbers[0], numbers[1]);
  
  for (var index = 2; index < numbers.length; index++) {
    if (numbers[index] < smallestNumber) {
      secondSmallest = smallestNumber;
      smallestNumber = numbers[index];
    } else if (numbers[index] < secondSmallest) {
      secondSmallest = numbers[index];
    }
  }
  
  return (smallestNumber + secondSmallest);
};
