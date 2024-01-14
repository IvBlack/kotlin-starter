fun main() {
    println(testSimple(2, 1))
    println(testString(46))
    println(testNamedArgs(y = 7, z = 1, x = 24))

    testDefaultArgs(3, 5)
    testDefaultArgs(y = 24)
}

fun testSimple(x: Int, y: Int) = x + y
fun testString(x: Int): String {
    return "String is $x"
}

//named arguments, args with any orders
fun testNamedArgs(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

//void function, default args
fun testDefaultArgs(x: Int = 1, y: Int = 8) {
    println(x + y)
}


/* ---------------------------------------------------
Demonstration  of kotlin perfection.
Instead overloading in Java, we can use function default args.
Example from Kotlin Koans:

public String foo(String name, int number, boolean toUpperCase) {
    return (toUpperCase ? name.toUpperCase() : name) + number;
}

public String foo(String name, int number) {
    return foo(name, number, false);
}

public String foo(String name, boolean toUpperCase) {
    return foo(name, 42, toUpperCase);
}

public String foo(String name) {
    return foo(name, 42);
}
*/

//the same thing in Kotlin prevents multiple overloading:
fun foo(name: String, number: Int = 42, toUpperCase: Boolean) {
    (if (toUpperCase) name.toUpperCase() else name) + number
}
//--------------------------------------------------------