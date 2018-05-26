package wjt.learn01

fun main(args : Array<String>) {
    println("hello, judge: ${judge(Sum(4, 7))}")
}

interface Expr

class Num(val value : Int) : Expr

class Sum(val rightV : Int,
          val leftV : Int) : Expr

// when可以在判断条件下用is判断是那种类型
// 如果有多条语句，则可以使用代码块，最后一句会默认认为是返回值
fun judge(e : Expr) =
        when(e) {
            is Sum -> {
                println("this is ${e.javaClass}")
                "sum"
            }
            is Num -> "num"
            else -> throw IllegalArgumentException("unknown")
        }