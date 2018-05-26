package wjt.learn01

import java.util.*

fun main(args : Array<String>) {
    val map = TreeMap<Char, String>()
    /*..运算符也可以构建字符数列*/
    for(c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        map[c] = binary
    }
    // 迭代map中的元素
    for((letter, binary) in map) {
        println("key=$letter value=$binary")
    }
    iterList()
    // in同时可以作为判断条件，看是否在范围中存在
    println("if a included: ${'a' in 'a'..'z'}")
    println("judge : ${"str" in "a".."z"}") // 虽然无法迭代，但可以判断出范围，可以操作任何实现了Comparable接口的对象
    println("judge element include : ${"kotlin" in setOf("kotlin", "java", "cpp")}") // in 同样可以作为集合的判断
}
// 迭代有index的列表
fun iterList() {
    val list = listOf(1, 11, 109)
    for ((index, value) in list.withIndex()) {
        println("index:$index value:$value")
    }
}

