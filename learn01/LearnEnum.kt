package wjt.learn01


/**
 * 这里主要是枚举类的用法
 *  和java一样，每一个枚举都是该类的子类，当必须有方法的时候，才需要用分号隔开（这是kotlin中唯一需要强制用分号的地方）
 */
enum class LearnEnum(val r : Int,
                     val g : Int,
                     val b : Int) {
    RED(255, 0 , 0),YELLOW(255,165, 0),
    GREEN(0,255, 0),BLUE(0, 0, 255),
    INDIGO(171, 0 , 130),VIOLET(238, 130, 238);

    fun rgb() = (r*256 + g) * 256 + b
}

fun main(args : Array<String>) {
    println(LearnEnum.BLUE.rgb())
    val word = getKeyWord(LearnEnum.INDIGO)
    println(word)
}

/**
 * when是强化性的分支语句，整一个也是表达式，有返回值（->之后的就是返回值）
 * 可以用逗号来分隔同一种分支
 * else表示除此之外的任何情况
 * 当导入整体的时候，可以省略前面的枚举类型
 */
fun getKeyWord(color : LearnEnum) =
        when(color) {
            LearnEnum.RED -> "red"
            LearnEnum.BLUE -> "blue"
            LearnEnum.GREEN -> "green"
            LearnEnum.INDIGO, LearnEnum.VIOLET -> "cold"
            else -> "nonono"
        }

// 如果这个when后面是不带判断参数的，那么这个when后面的条件可以是任意布尔值
// 类似于if else if这种分支，不过看起来更简洁
fun mix(c1: LearnEnum, c2 : LearnEnum) =
        when {
            c1 == LearnEnum.RED && c2 == LearnEnum.BLUE -> "mix success"
            else -> "mix fail"
        }








