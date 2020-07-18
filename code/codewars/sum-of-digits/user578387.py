def digital_root(n):
    return 1 + ((int(n) - 1) % 9) if n>0 else 0
