def digital_root(n)
  return n < 1 ? 0 : (n - 1) % 9 + 1
end
