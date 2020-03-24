package com.dotinfiny.mvvmexample.collections

import androidx.lifecycle.Transformations.map

fun main() {
    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library = mapOf("William Shakespeare" to allBooks)
    val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")

    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet Book") { "Shakespeare" }
    moreBooks.getOrPut("Wilhelm Tell") { "Shakespeare" }

//    println(moreBooks)
//    println(library.any { it.component1().contains("William") })

    println("hello world".hasSpaces())
    println(1.hasValuepak())
    println(10.bookWeight())
}
fun Int.bookWeight() : Double = (this * 1.5)


fun String.hasSpaces(): Boolean = this.find { it == ' ' } != null

fun Int.hasValuepak() = this == 0 != null