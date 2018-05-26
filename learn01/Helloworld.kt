package wjt.learn01


/*
    第一个程序：注意数组的关键字是Array，不再和java一样提供【】的形式
 */
fun main(args: Array<String>) { // the first normal helloworld
    print("helloworld")
    learnPrint()
}

/*
*   函数范式： fun 函数名（函数入参）：返回类型
*   注意：参数的类型在冒号后面
*   java中的if语句在kotlin中是 表达式，即可以有返回值，可以陷入到其他的表达式中
*/
fun max(a:Int, b:Int) : Int {
    return if (a > b) a else b
}
// simplify 等号在kotlin中是语句，返回类型可以根据类型推导（kotlin编译器的功能）
// 只有表达式体的返回类型可以被省略
fun max2(a:Int, b:Int) = if (a > b) a else b


// val是不可变变量，相当于加了final， var是普通变量
fun learnValAndVar() {
    val question = "which number is your favorite?"
    val answer = 1
    var number = 5 // 但类型推导过一次之后，类型变固定，kotlin还是静态类型语言
    number = 7

}

/*
*   字符串输出有模板模式，在很多场合可以替代模板技术，用$后加变量名但方式可以输出变量
*   如果有复杂表达，可以用${}输出
*/
fun learnPrint() {
    val name = "kotlin is powerful"
    println("hello, $name, today's number is ${if (5 > 4) 1 else 0}")
}




