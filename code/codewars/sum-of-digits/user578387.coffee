digital_root = (n)->
  if n>0 then 1 + ((parseInt(n) - 1) % 9) else 0
