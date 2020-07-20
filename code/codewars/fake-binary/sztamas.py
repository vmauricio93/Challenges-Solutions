import string

def fake_bin(s):
    return s.translate(string.maketrans('0123456789', '0000011111'))
