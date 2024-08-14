//Если честно я даже не знаю как тут прокомментировать и так вроде максимально понятно


object StringProcessor {
  def processStrings(strings: List[String]): List[String] = {
    val res = strings.filter(_.length > 3).map(_.toUpperCase)
    res
  }

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}