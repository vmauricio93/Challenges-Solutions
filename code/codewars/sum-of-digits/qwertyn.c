int digital_root(int n) {
  if (n < 10) return n;
  int r = 0;
  while (n) r += n % 10, n /= 10;
  return digital_root(r);
}
