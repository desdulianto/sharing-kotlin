/**
 * Created by david on 6/17/17.
 */

fun main(args: Array<String>) {
    // collection di kotlin dibagi menjadi 2 jenis, mutable dan immutable

    // immutable list
    val namas = listOf("Budi", "Agus", "Iwan", "Rudi", "Susi", "Tuti", "Doni")

    println("Banyak nama: ${namas.size}")

    // akses ke list pakai operator [] seperti akses ke array
    println("Nama[0]: ${namas[0]}")

    // mutable list, walaupun namas1 di deklarasikan dengan val, list nya tetap bisa diubah, hanya
    // namas1 tidak bisa lagi diubah menjadi list yang lain
    val namas1 = mutableListOf("Budi", "Agus", "Iwan", "Rudi", "Susi", "Tuti", "Doni")
    namas1.add("Lisa")
    namas1[0] = "Joni"

    // immutable Set
    val planets = setOf("Merkurius", "Venus", "Bumi", "Mars", "Jupiter", "Saturnus", "Uranus", "Neptunus", "Bumi")

    println("Planets: ${planets}")

    // immutable map
    val nilai = mapOf("Budi" to 90,
                      "Agus" to 70,
                      "Iwan" to 80,
                      "Rudi" to 50,
                      "Susi" to 90,
                      "Tuti" to 60,
                      "Doni" to 40)

    // extension functions
    println("Daftar nama: ")
    // execute statement untuk setiap item list, return Unit
    namas.forEach {
        println(it)     // setiap item direferensi dengan variable it (khusus untuk yang hanya 1 parameter saja)
    }

    // map item list ke bentuk lain
    println("Daftar nama dan panjang karakter: ")
    namas.map {
        Pair(it, it.length)     // pair - tuple 2 item
    }.forEach {
        println("Nama: ${it.first}, Panjang karakter: ${it.second}") // disini setiap item namas sudah berubah menjadi
                                                                     // pair (nama, nama.length)
    }

    // filter list sesuai dengan predicate (kriteria)
    println("Daftar nama dengan nilai >= 80")
    nilai.filter { it.value >= 80 }.forEach { println(it.key) }
    println("Daftar nama diakhiri dengan 'i' dan nilai >= 80")
    nilai.filter { it.key.endsWith("i") && it.value >= 80 }.forEach { println(it.key) }
    // atau
    nilai.filter { it.key.endsWith("i") }.filter{ it.value >= 80}.forEach { println(it.key) }

    // bagi list menjadi dua sesuai dengan predicate (kriteria)
    val (lulus, tidak_lulus) = nilai.asSequence().partition { it.value >= 60 }

    println(lulus)
    println(tidak_lulus)
}
