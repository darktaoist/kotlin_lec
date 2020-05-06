//산술연산자 (+ - * / %)
fun main(args: Array<String>):Unit {

     val num1: Int = 10 + 20 - 27
    //val num1: Double = 10.0 + 20 - 44
    val num2: Int = 200 % 3
    val num3: Double = 7.5/5 + 11.1  //실수와 정수 계산하면 실수가 된다.
    //val num4: Double = num1/num2 + 0.3
    val num4: Double = num1.toDouble()/num2 + 0.3
    println(num1)
    println(num2)
    println(num3)
    println(num4)

}
