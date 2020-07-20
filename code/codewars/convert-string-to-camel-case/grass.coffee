toCamelCase = (str) ->
  str.replace /(-|_)./g, (x) -> x[1].toUpperCase()
