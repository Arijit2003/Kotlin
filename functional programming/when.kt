package com.example.hello

fun main(){
    val month=8
    when(month){
        in 3..5->println("Summer")
        in 6..8->println("Moonsoon")
        in 9..11->println("Fall")
        in 12 downTo 2->println("Winter")
    }
    val X:Any="Arijit"
    when(X){
        is Int->println("$X is an Integer")
        is Float->println("$X is an Float")
        is Double->println("$X is an Double")
        is String->println("$X is an String")
        is Char->println("$X is an Character")
    }

}