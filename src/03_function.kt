/**
 * Created by david on 5/27/17.
 */

// FUNCTION
// fungsi di deklarasi dengan keyword fun
// parameter boleh diberikan default value
// return value fungsi dituliskan setelah parameter fungsi
// fungsi yang tidak mengembalikan nilai memiliki return type Unit -> mirip dengan void di Java
fun hello(nama: String = "world", waktu: String = "pagi") /* : Unit */ {
    println("Hello $nama, selamat $waktu")
}

// apabila fungsi hanya terdiri dari satu ekspresi bisa diringkas dengan cara berikut
fun isPalindrom(s: String): Boolean = s.toLowerCase() == s.reversed().toLowerCase()

fun main(args: Array<String>) {
    // karena fungsi hello kedua parameternya ada default value
    // bisa dipanggil tanpa kirim parameter, fungsi akan menggunakan
    // default parameter
    hello()

    // memanggil fungsi dengan parameter positional
    hello("budi")

    // memanggil fungsi dengan nama parameter
    hello(waktu="malam")

    val name = "Hannah"
    println("$name is palindrom: ${isPalindrom(name)}")
}
