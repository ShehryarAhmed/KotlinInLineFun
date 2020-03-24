package com.dotinfiny.mvvmexample.HigherOrderFunction

data class Fish(var name: String)

fun main() {
    fishExample()

    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)

//    val output = {numbers -> for(item in numbers){if(item/3 == 0){item}else{} }}
}

fun fishExample() {
    val fish = Fish("splashy")

    with(fish.name) {
        println(capitalize())
    }

    myWith(fish.name) {
        println(capitalize())
    }

    println(fish.run {name})

    println(fish.apply {  })

    val fish2 = Fish(name = "splashy").apply { name = "Sharky" }
    println(fish2.name)


    println(fish2.let{it.name.capitalize() }.let { it + "fish" }.let{it.length}.let{it+30})
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

class FishExample() {

    fun makeFish() {
        println("make fish")
    }

    fun checkFish() {
        println("check fish")

    }
}