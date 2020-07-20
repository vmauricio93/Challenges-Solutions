object CamelCase {
  val toCamelCase = "[_-](.)".r.replaceAllIn(_: String, _.group(1).toUpperCase)
}
