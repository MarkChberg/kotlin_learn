package wjt.learn02

// 自己实现的泛型方法，给集合打印格式 ，这个位置属于顶层函数，在java中对应的是静态方法
fun <T> joinerToString(collection : Collection<T>,
                       joiner : String = "，",
                       prefix : String = "【",
                       suffix : String = "】") : String  {
    val str = StringBuilder(prefix)
    for((index,element) in collection.withIndex()) {
        if (index > 0) str.append(joiner)
        str.append(element)
    }
    str.append(suffix)
    return str.toString()
}

val nationality : String = "China" // 顶层属性与其他的类属性一样有对应的getter和setter方法，如果是val则只有getter

const val sex = "male" // 加入const修饰的val相当于java中的常数，即public static final

fun main (args : Array<String>) {
    println(joinerToString(listOf(1,2,3,4), "---", "(", ")"))
    // 可以使用命名参数，和python的形式类似
    println(joinerToString(listOf(1,2,3,4), prefix = "[", suffix = "]", joiner = "-"))
    // 与python一样，形式参数可以设定默认值，如果不传，即使用默认值
    println(joinerToString(listOf(1,2,3,4)))
    println(joinerToString(listOf(1,2,3,4), prefix = "{"))
}