package me.xiao.learn.kotlin

import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

/**
 * 编程惯用法
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/7/20 15:36
 */

fun main(args: Array<String>) {
//    dataClass()
//    utils2()
//    printFun()
//    withClass()
//    iouse()
    genericSample()
}

fun genericSample() {
//    TODO 不懂是什么意思


//    public final class Gson{
//        public <T> T fromJson(JsonElement json, Class<T> classOfT){
//
//        }
//    }

//    inline fun <reified T : Any> Gson.fromJson(json): T = this.fromjson(this, T::class.java)
}


fun iouse() {
    val stream = Files.newInputStream(Paths.get("C:\\Users\\BaoQiang\\Desktop\\1.txt"))
    stream.buffered().reader().use { reader -> println(reader.readText()) }
}

fun withClass() {
    class A {
        fun fun1() {
            println("a")
        }

        fun fun2() {
            println("b")
        }
    }

    val a = A()
    with(a) {
        fun1()
        fun2()
    }

}

fun printFun() {
//    println(tryCatch0())
    println(ifState(2))
//    println(Arrays.toString(ones(20)))
}

fun tryCatch(): Int? {
    return try {
        1 + 2
    } catch (e: ArithmeticException) {
        null
    }
}

fun ones(size: Int): IntArray {
    return IntArray(size).apply { fill(1) }
}

fun ifState(i: Int): String? {
    return if (i == 1) {
        "one"
    } else if (i == 2) {
        "two"
    } else {
        null
    }
}

fun dataClass() {
    val c = Customer("xiao", 18);
    println(c)
    println(c.name)
    println(c.hashCode())
}

fun utils() {
    val list = listOf(11, 22, 33)
    val evens = list.filter { it % 2 == 0 }
    println(evens)

    val map = mapOf("a" to 1, "b" to 2)
    for ((k, v) in map) {
        println("$k: $v")
    }

    val p: Int by lazy {
        3 + 4
    }
    println(p)

    println("a".twice())
}

fun utils2() {
    val files = File("aaa").listFiles()
    println(files?.size ?: "empty")

    val aaa: Boolean? = true
    aaa?.let { println("this is true") }

}

fun String.twice(): String {
    return "$this$this"
}

// 单例
object Instance {
    val instance = "instance"
}

data class Customer(val name: String, val age: Int)
