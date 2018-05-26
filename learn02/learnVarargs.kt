package wjt.learn02

fun main (args : Array<String>) {
    // 此处的构造使用变长参数来进行获取， 变长参数由vararg 来声明
    val list = listOf(3, 5, 7)
    // to是一个中缀调用，只可以与一个参数的函数一起使用，两种情况是一样的，后者是原始形式
    val map = mapOf(1 to "a", (2 to "b"), 3.to("c"))
    val (key, value) = 1 to "c" // 解构后可以使用此方式来声明变量
    println(key)
    println('c' add 9)
}

// infix就是中缀调用的关键字，它只能适用于一种形式参数的方法,this代表前一个参数
infix fun Char.add(other:Int) = this.toInt() + other

