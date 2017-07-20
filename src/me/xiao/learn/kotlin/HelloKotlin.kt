package me.xiao.learn.kotlin

/**
 * 入门
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/7/20 13:41
 */

import java.util.ArrayList;

fun main(args: Array<String>) {
//    println("Hello, Kotlin!")
    HelloKotlin().greeting("xiao")
}

class HelloKotlin {
    fun greeting(name: String){
//        val list = ArrayList<Int>()
//        list.add(2)
//        list.add(1)
//        print(list)

        println("Hello, " + name)
    }
}
