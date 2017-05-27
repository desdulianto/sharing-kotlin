/**
 * Created by david on 5/27/17.
 */

/* hello world, kotin style */

// top level function, entry point
// function di definisikan dengan keyword fun
// deklarasi parameter, variable, property/atribut -> nama: type
fun main(args: Array<String>) {
    println("Hello World")

    // BASIC TYPE
    // Byte, Short, Int, Long, Float, Double, Boolean, String, Char, Array
    // https://kotlinlang.org/docs/reference/basic-types.html
    // VAL & VAR
    // val -> deklarasi variable final (constant)/immutable
    // var -> deklarasi variable mutable
    val nama: String = "Budi"
    var umur: Int = 20
    val jenisKelamin: Boolean = true
    var gaji: Float = 5_000_000f
    var pendidikan: Array<String> = arrayOf("SD", "SMP", "SMA", "S1")

    gaji += 1_000_000f
    pendidikan += "S2"
    pendidikan.forEach {
        println(it)
    }

    // TYPE INFERENCE
    // type bisa di-infer oleh compiler dari expression disebelah kanan
    val alamat = "Jl. Gajah Mada No. 10" // alamat String


    // STRING INTERPOLATION
    println("Alamat: $alamat")
    println("Pajak penghasilan 10%: ${gaji * 0.1}")

    // NULLABILITY
    // variable yang bisa menampung nilai null, tambahkan ? di belakang type
    var pasangan: String? = null

    // untuk diakses/atau digunakan mesti dicheck apakah null atau tidak null
    if (pasangan != null)
        println("Pasangan: $pasangan")
    // akses method object null gunakan operator ? untuk pengecekan
    println("PASANGAN: ${pasangan?.toUpperCase()}")
    // atau bisa pakai elvis operator ?: untuk memberikan nilai default pada variable null
    println("Pasangan: ${pasangan ?: "belum ada"}")
    println("PASANGAN: ${pasangan?.toUpperCase() ?: "belum ada"}")

    // kalau sudah di cek apakah null atau bukan, object otomatis akan di smart-cast menjadi type not null
    // eg. String? -> String
    // jadi tidak dibutuhkan lagi operator ? untuk memanggil method
    if (pasangan != null)
        println("PASANGAN: ${pasangan.toUpperCase()}")


    // CASTING AND TYPE CHECK
    pasangan = "Susi" as String // pasangan = (String) "Susi", not safe casting (not nullable)
    pasangan = null as? String // safe casting (nullable)

    val data = arrayOf("Budi", 20, 10_000_000f, true)

    // type check, instance of
    data.forEach {
        when (it) {
            is String -> println("$it is String")
            is Int -> println("$it is Int")
            is Float -> println("$it is Float")
            is Boolean -> println("$it is Boolean")
        }
    }
}
