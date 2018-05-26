package wjt.learn01


// while循环和do。。。while循环没有改变，不做例子



fun main(args : Array<String>) {
    printNumber()
    println()
    printCountNumber()
}

// 这种语法叫做数列，在kotlin中是双闭合的数列，step代表步长，downTo代表倒数
fun printNumber() {
    for (i : Int in 0..100 step 5)
        print("$i ")
}

fun printCountNumber() {
    for (i : Int in 100 downTo 0 step 5)
        print("$i ")
}
