package ktn

fun helloMe(name : String = "Anonymous") {
    println("Hello there $name")
}

fun main(args : Array<String>) {
    helloMe("Aditya")
    helloMe()
    println("First ${foo()}, second ${foo()}")
}

fun foo(): String {
    println("Calculating foo...")
    return "foo"
}

