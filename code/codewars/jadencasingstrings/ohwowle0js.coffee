String::toJadenCase = ->
  @replace /(?:^|\s)[a-z]/g, (match) ->
    match.toUpperCase()
