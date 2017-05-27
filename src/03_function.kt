/**
 * Created by david on 5/27/17.
 */

// FUNCTION
// fungsi di deklarasi dengan keyword fun
// parameter boleh diberikan default value
fun hello(nama: String = "world", waktu: String = "pagi") {
    println("Hello $nama, selamat $waktu")
}

fun main(args: Array<String>) {
    // karena fungsi hello kedua parameternya ada default value
    // bisa dipanggil tanpa kirim parameter, fungsi akan menggunakan
    // default parameter
    hello()

    // memanggil fungsi dengan parameter positional
    hello("budi")

    // memanggil fungsi dengan nama parameter
    hello(waktu="malam")
}
