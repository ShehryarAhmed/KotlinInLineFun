package com.dotinfiny.mvvmexample.extensionFunction

import kotlin.random.Random

class Extension {

}

class Book(var title:String, var author:String, var year:Int, var pageCount:Int)

fun Book.bookWeight() : Double = (pageCount * 1.5)

fun Book.tornPage(torn:Int) = if(pageCount >= torn) pageCount -= torn else pageCount = 0

class Puppy(){
    fun playWithBook(book:Book){
        book.tornPage(Random.nextInt(12))
    }
}

fun main(){
    val puppy = Puppy()
    val book = Book("Test","Author",2020,100)

    while (book.pageCount > 0){
        puppy.playWithBook(book)
        println("${book.pageCount} left in ${book.title}")
    }

    println("Sad puppy, no more pages in ${book.title}. ")

}