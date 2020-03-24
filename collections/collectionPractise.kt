package com.dotinfiny.mvvmexample.collections

import android.os.Build

class collectionPractise {


}


fun main() {
    val testList = listOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val testList2 = mutableListOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val anOtherList = mutableListOf("White Spot", "Red Spot", "not eating")

    for (str in anOtherList) {
        print(str.reversed())
    }
    println(anOtherList.reversed())
    println(testList.reversed())
    println(reversedList(testList))

    println(testList2.sum())
    println(listOf("abc", "b", "C").sumBy { it.length })

    val cures = mapOf("white spots" to "Ich", "red sores" to "hole disease")
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        println(cures.getOrDefault("ICH","Not found"))
    }

}

fun reversedList(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in list.size - 1 downTo 0) {
        result.add(list.get(i))
    }
    return result.reversed()
}