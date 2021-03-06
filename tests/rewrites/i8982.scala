
object Foo {
  def bar(x: Int): Unit = {
    println(x)
  }
}

class Baz(n: Int) {
  def printRepeat(repeat: Int) = {
    for {
      x <- 1 to repeat
    } println(s"$x - ${n * x}")
  }
}
