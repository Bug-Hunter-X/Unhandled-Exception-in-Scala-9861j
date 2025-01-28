```scala
class MyClass(val value: Int) {
  def myMethod(x: Int): Int = {
    if (x == 0) {
      throw new IllegalArgumentException("x cannot be zero")
    }
    value / x
  }
  def myMethodSafe(x:Int):Int = {
    try{
        myMethod(x)
    } catch{
        case e:IllegalArgumentException => println("Exception caught: "+ e.getMessage()); 0
    }
  }
}

val myObj = new MyClass(10)
println(myObj.myMethodSafe(2)) // 5
println(myObj.myMethodSafe(0)) // 0, exception caught
```