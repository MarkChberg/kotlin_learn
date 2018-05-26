package wjt.learn01

// 在kotlin中，public是默认的，所以可以直接省略，并且也不要求一个文件里只有一个public
// kotlin基于属性，在本类里只有一个name的属性，并且这个name是不可变的（只有getter，默认实现）
// 构造器即类定义方法
// 这种类叫做数据类
class Person(val name : String)

// 当属性为var的时候，表示这个值可以被改变，如此便是生成getter和setter两种方法
class Person2(val name : String,
              var isMarried : Boolean)

// 此处为自定义访问器方法（此处也可以用一个方法判断，但用属性更符合设计理念）
class Rectangle(val width : Int,
                val height : Int) {
    val isRectangle : Boolean
        get() = width == height
}

fun main(args : Array<String>) {
    val person = Person("wjt")
    println(person.name)
    val person2 = Person2("wjt", true)
    println("name:${person2.name}, isMarried:${person2.isMarried}")
    person2.isMarried = false
    println("name:${person2.name}, isMarried:${person2.isMarried}")
    println(person.toString()) // 和java一样的打印
    val rectangle = Rectangle(5, 5)
    println(rectangle.isRectangle)

}


