package com.dotinfiny.mvvmexample.lambdasRecap

class Pracitise {
}

fun main() {
    val waterFilter = { dirty: Int -> dirty / 2 }
    print(waterFilter(30))

    data class Fish(val name: String)

    val myFish = listOf(Fish("Flipper"), Fish("Doper"), Fish("Moby Dick"))
    println(myFish.filter { it.name.contains("i") }.joinToString("") { it.name })
}