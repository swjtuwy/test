package com.kotlin.test

fun main(args: Array<String>) {
    var x = 0
    if (x > 0) {
        println("x 大于 0")
    } else if (x == 0) {
        println("x 等于 0")
    } else {
        println("x 小于 0")
    }

    var a = 1
    var b = 2
    val c = if (a >= b) a else b
    println("c 的值为 $c")
}