def fake_bin(s)
  s.gsub(/[0-9]/) { |n| n.to_i < 5 ? '0' : '1' }
end
