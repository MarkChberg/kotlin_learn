package wjt.learn01

fun main(args : Array<String>) {
    exeException(10)
    // try...catch...finally结构此处用法和java中一样
    try {
        exeException(-9)
    } catch (e : Exception) {
        println(e.message)
    } finally {
        println("end")
    }
    // 此处的结构是用表达式的方式
    val num =
            try {
                Integer.parseInt("1*2")
            } catch (e : Exception) {
                10
            }
    println("num : $num")
    // 当然，可以嵌入输出里
    println("num : ${
    try {
        Integer.parseInt("1*2")
    } catch (e : Exception) {
        10
    }
    }")
}

// throw在kotlin中是一个表达式，可以作为另一个表达式的一部分
fun exeException(a : Int) = if (a > 0) a else throw IllegalArgumentException("参数异常")