package wjt.learn02


fun main(args : Array<String>) {
    createCollection()
    val list = listOf(1,2,3,4,5)
    println(list)
}

// 可见：kotlin使用的集合类使用的是java的集合标准库
fun createCollection() {
    val set = hashSetOf("qq", "wechat", "jd")
    val list = arrayListOf(1, 9, 10)
    val map = hashMapOf("aa" to 1, "bb" to 2, "cc" to 3)

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
    // kotlin用拓展的方式提供了一些新的方法
    println(set.last())
    println(list.max())
}