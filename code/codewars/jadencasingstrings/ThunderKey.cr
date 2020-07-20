class String
  def toJadenCase
    gsub /(\A|\s)[a-z]/, &.upcase
  end
end
