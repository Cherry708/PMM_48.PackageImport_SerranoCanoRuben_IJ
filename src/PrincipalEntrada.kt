import entradaTeclado.*

fun main() {
    println("Introduce el primer entero: ")
    val numero1 = entradaInt()
    println("Introduce el segundo entero: ")
    val numero2 = entradaInt()
    println("La suma de enteros es ${numero1 + numero2}")

    println("Introduce el primer double: ")
    val numero3 = entradaDouble()
    println("Introduce el segundo double: ")
    val numero4 = entradaDouble()
    println("La suma double es ${numero3 + numero4}")
}