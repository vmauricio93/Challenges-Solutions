function digital_root(n) {
  // ...
  var output = []
  var s_number = n.toString();

for (var i = 0, len = s_number.length; i < len; i += 1) {
    output.push(+s_number.charAt(i));
}
  if (output.length === 1) {
    return output[0]
  }

  for (var i = 0, sum = 0; i < output.length; sum += output[i++]);
  

  return digital_root(sum)
}
