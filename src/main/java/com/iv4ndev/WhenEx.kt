fun main() {
    whenWithAny(1)
    whenWithAny("Kotlin navsegda!")
    whenWithAny(3.14)
}

//тип Any - аналог Object в java
//можно подставлять любой тип на вход функции
fun whenWithAny(input: Any) {
    when(input) {
        1 -> println("This is one.")
        5 -> println("This is two")
        in 10..20 -> println("Between 10 & 20")
        is String -> println("String was inputed: ${input.length}")
        else -> print("Somethng else")
    }
}