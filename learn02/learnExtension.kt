package wjt.learn02

// 方法名前是接受者类型（即你要将你的拓展方法添加到哪个类中）， this表示该接受者的对象（一个实例）（this可以省略）
fun String.lastChar() : Char = this.get(this.length - 1)

fun main (args : Array<String>) {
    println("char : ${"strings".lastChar()}")
    println(listOf("one", "two", "three").joinStr()) // 这里是调用拓展函数，如此可以像类方法一样调用
    joinerToString(listOf(1,2,3)) // 这个时候是直接调用函数，而不是使用拓展函数
}

// 要在其他地方使用，可以导入该文件，如果命名冲突可以使用as关键字（同python）
// 在java中，拓展函数是静态函数 调用是 LearnExtension.lastChar("java")
// 拓展函数不能被重写，因为它不属于类，它的执行是由静态类型决定的

fun <T> Collection<T>.join(joinner:String = ",",
                            prefix:String = "(",
                            suffix:String = ")"
) : String {
    val str = StringBuilder(prefix)
    for((index,element) in this.withIndex()) {
        if (index > 0) str.append(joinner)
        str.append(element)
    }
    str.append(suffix)
    return str.toString()
}


fun Collection<String>.joinStr(joinner:String = ",",
                            prefix:String = "(",
                            suffix:String = ")"
) : String = join(joinner, prefix, suffix) // 拓展函数同样无法重载

// 声明拓展属性，可以和成员函数一样使用get（） 和 set（）
val StringBuilder.lastChar : Char
    get() = get(length - 1)




