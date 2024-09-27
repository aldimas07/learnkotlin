package org.example

fun main() {
    var a : String? = "Kotlin"
    a = null
//    println(a)

//    println(addEven(10))
//    println(isPrime(3))
//    val txt: String? = null
//    val txtLength = txt?.length?:1
//    println(txtLength)
//    val integerList = listOf(1,32.45,6,3,12)
//    val mapStr = mapOf("indo" to "jakarta", "malang" to "bumiayu")
//    println(mapStr.getValue("indo"))
//    val myList = arrayOf(2,1,5,3,7)
//    for(i in myList){
//        print(myList.sort())
//    }

//    println(isPrime(45))
//    println(reverseString("kotlin"))
//    pascal(5)
//    segitiga(5)
//    val value = 1
//    val stringofValue = when (value) {
//        1 -> {
//            println("value is 1")
//            "valueee iss 1"
//        }
//        2 -> println("value is 2")
//        else ->
//            println("value is not 1 and 2")
//    }
//    print(stringofValue)
//    val anyType: Any = 100_000L
//    when (anyType) {
//        is Short -> println("it is Short")
//        is Long -> println("it is Long")
//        else -> println("undefined")
//    }
//
//    var vall = 'A'
//    do {
//        println(vall)
//        vall++
//    } while (vall <= 'Z')
//    val alpha = 'A'.rangeTo('Z')
//    println(alpha)
//    val numb = 1.rangeTo(10).step(2)
//    numb.forEach{
//        print("$it")
//    }
//    println(numb.step)

    for (i in 1..10) {
        println("Outside loop")
        for (j in 1..6) {
            println("Inside loop")
            if (j > 4) break
        }
    }
}

fun addEven(n: Int): Int{
    var j = 0
    for (i in 1..n) {
        if (i % 2 == 0) {
            j = j + i
            println("debug i: $i + j: $j")
        }
    }
    return j
}

fun fizzBuzz() {
    for (i in 1..15){
        if (i % 3 == 0 && i % 5 == 0) {
            println("$i = FizzBuzz")
        } else if (i % 3 == 0) {
            println("$i = Fizz")
        } else if (i % 5 == 0) {
            println("$i = Buzz")
        } else {
            println(i)
        }
    }
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}
fun isPrime(n: Int): Boolean {
    var j : Boolean = true
    for (i in 1..n) {
        if (i < 2) {
            j = false
        }
        if (i % i * (i-1) != 0) {
            j = true
        } else {
            j = false
        }
    }
    return j
}

fun reverseString(n: String): String {
    var reversed = ""

    for (i in n.length -1 downTo 0) {
        reversed += n[i]
    }
    return reversed
}

fun pascal(inp: Int) {
    for (i in 0 until inp) {
        for(j in 0..i) {
            print("${binomialcoeff(i,j)}")
        }
        println()
    }
}
fun binomialcoeff(n: Int, k: Int): Int {
    var res = 1;
    var kmod = k
    if (kmod > n - k) {
        kmod = n - k
    }
    for (i in 0 until kmod){
        res *= (n-i)
        res /= (i+1)
    }
    return res
}

fun segitiga(p: Int) {
    for (i in 1..p){
        for (space in 1..(p-i)){
            print(' ')
        }
        for (star in 1..(2 * i - 1)){
            print("*")
        }
        println()
    }
}