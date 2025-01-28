```scala
class MyClass(val value: Int) {
  def myMethod(x: Int): Int = {
    if (x == 0) {
      throw new IllegalArgumentException("x cannot be zero")
    }
    value / x
  }
}

val myObj = new MyClass(10)
println(myObj.myMethod(2)) // 5
println(myObj.myMethod(0)) // throws exception
```