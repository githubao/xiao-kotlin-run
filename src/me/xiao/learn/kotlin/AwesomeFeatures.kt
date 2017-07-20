package me.xiao.learn.kotlin

/**
 * 特性
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/7/20 14:16
 */

fun main(args: Array<String>) {
//    valAndInferAndStrTemplate()
//    nullAndNotNull()
//    typeCast()
//    forImpl()
//    whenCase()
//    rangeCase()
    lambdaFilter()
}

fun lambdaFilter() {
    val items = setOf("apple", "banana", "orange")
    when {
        "apple" in items -> println("apple in")
        "watermelon" in items -> println("watermelon in")
    }

    items.filter { !it.startsWith("a") }.sortedByDescending { it }.map { it.toLowerCase() }.forEach { println(it) }
}

fun rangeCase() {
    for (i in 0..10 step 2) {
        println(i)
    }
    for (x in 9 downTo 0 step 3) {
        println(x)
    }
}

fun whenCase() {
    println(describe(1))
    println(describe("Hello"))
    println(describe(100L))
    println(describe(2))
    println(describe("other"))
}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "not a str"
            else -> "Unknown"
        }


fun forImpl() {
//    val list = listOf<String>("aa","bb","cc")
    val list = listOf("aa", "bb", "cc")
    for (s in list) {
        println(s)
    }
    for (i in list.indices) {
        println("index $i is ${list[i]}")
    }
}

fun typeCast() {
    val s = "a"
    val s2 = 3.2

    println("$s len is ${getStringLength(s) ?: "not a string"}")
    println("$s2 len is ${getStringLength(s2) ?: "not a string"}")
}

fun getStringLength(obj: Any): Int? {
    if (obj !is String) {
        return null;
    }
    return obj.length
}

fun nullAndNotNull() {
//    var s: String = null // err
    val s1: String? = null
//    print(s1.length) //err
    val len = if (s1 != null) s1.length else null
    val len2 = s1?.length
    println("$len, $len2")
}

fun valAndInferAndStrTemplate() {
    val const = 3
    var variable = 3

    println("$const, $variable")

    val a: Int
    val b = 4
    a = b + 2
    println("$a + $b is ${mySum(a, b)}")
    println("$a + $b is ${a + b}")
}

fun mySum(a: Int, b: Int) = a + b
