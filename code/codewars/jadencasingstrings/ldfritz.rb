class String
  def toJadenCase
    self.gsub(Regexp.union(/^./, /\s\w/), &:upcase)
  end
end
