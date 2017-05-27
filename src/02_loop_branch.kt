/**
 * Created by david on 5/27/17.
 */

fun main(args: Array<String>) {
    // Range, untuk class yang mengimplementasikan interface ClosedRange
    // menggunakan operator ..
    val ganjil = 1..100 step 2

    println(ganjil.joinToString(separator=", "))

    // loop while
    var i = 1
    while (i < 10) println(i++)

    // loop do while
    do { println(i++) } while (i < 20)

    // break & continue
    i = 0
    while(i < 10)
        if (i == 5) break
        else println(i++)

    i = 0
    while (i < 10)
        if (i in arrayOf(1,3,7)) { i++; continue; }
        else println(i++)


    // for loop
    for (i in 10 downTo 1)
        println(i)

    // LOGICAL OPERATOR
    // ==, != -> structural equality
    // ===, !== -> referential equality, a === b apakah a dan b merujuk ke object yang sama
    // >, <, >=, <= -> perbandingan
    // &&, ||, ! -> and, or, not
    // is -> type check
    // in -> a in b apakah a ada di dalam iterable b

    // IF
    if (i in 1..100) {
        println("i ada di dalam 1..100")
    } else {
        println("i tidak ada di dalam 1..100")
    }

    // WHEN
    // simple when
    when (i) {
        is Int -> println("i integer")
        is Int? -> println("i nullable integer")
        else -> println("i bukan integer")
    }
    // complex when
    when {
        i is Int -> println("i integer")
        i is Int? -> println("i nullable integer")
        else -> println("i bukan integer")
    }
}
