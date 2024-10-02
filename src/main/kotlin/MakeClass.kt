package org.example

class Animal {
    var name: String = "Kucing merah"
    var weight: Double? = null
    var age: Int = 1
    var isMamal: Boolean = false

    fun eat() {
        println("$name sedang makan!")
    }
    fun sleep() {
        println("$name sedang turu")
    }
}
val homeCat = Animal()

fun main(){
    println("" +
            "name: ${homeCat.name}," +
            "\nBerat: ${homeCat.weight}, " +
            "\nUmur: ${homeCat.age}, " +
            "\nMerupakan mamalia?: ${homeCat.isMamal}")
    homeCat.eat()
}