import java.lang.IllegalArgumentException

object Num1 {
}

fun main() {
    println("q:")
    val q = readLine()?.toInt() ?: return
    if (q !in (0..500)) throw IllegalArgumentException("q")
    var n: Int
    var a: Int
    var b: Int
    var add: Int
    val output = mutableListOf<MutableList<Int>>()
    var s: MutableList<Int>
    for (i in 0 until q) {
        s = (readLine()?.split(" ")
            ?.map { it -> it.toInt() } ?: return) as MutableList<Int>
        a = s[0]
        b = s[1]
        n = s[2]
        if (a !in (0..50) || b !in (0..50) || n !in (1..15))
            throw IllegalArgumentException("a, b or n")
        add = 1
        s = mutableListOf()
        for (j in 0 until n) {
            a += add * b
            add *= 2
            s.add(a)
        }
        output.add(s)
    }
    for (i in output) {
        println()
        for (j in i) print("$j ")
    }
}