package org.example

import org.w3c.dom.ranges.Range

fun main() {
    val listofInt = listOf(1,2,3,null,5,6,null,8,null,10)
    for (i in listofInt) {
        if (i == null) continue
        print(i)
    }

    println("\n1.========")
    for (j in listofInt) {
        if (j == null) break
        print(j)
    }

    println("\n2.=========")
    /* untuk membatasi looping dalam looping,
    * kita bisa memberikan label expression */
    looping@ for (ind in 1..10) {
        println("Outside loop")
        for (ind2 in 1..5) {
            println("Inside loop")
            if (ind2 > 3) break@looping
        }
    }

    //for with index and value
    val value : Int
    println("\n3.===========")
    for((index, value) in listofInt.withIndex()) {
        println("$index dan $value")
    }


}