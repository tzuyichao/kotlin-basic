
val x = add(mult(2, 3), mult(4, 5))

println(x)

val y = add(6, 20)

println(y)

fun add(a: Int, b: Int): Int {
    log(String.format("Returning ${a + b} as result of $a + $b"))
    return a+b
}

fun mult(a: Int, b: Int) = a * b

fun log(m: String) {
    println(m)
}