/**
 * Created by david on 6/16/17.
 */

// penulisan class di kotlin sangat padat
// atribut dan constructor default dituliskan pada signature class
class Manusia(                          // deklarasi class, sekaligus default/primary constructor
        val nama: String,               // atribut read only
        val jenisKelamin: String,       // atribute read only
        var umur: Int,                  // atribute read write
        private val pendapatan: Long =0L// atribute private
) {
/* atribut di class kotlin secara default memiliki akses public
   begitu juga dengan method
 */
    fun ulangTahun() = this.umur++
}

// inheritance
// class pada kotlin secara default di deklarasikan sebagai class final
// jadi secara default class kotlin tidak dapat di-subclass (inherit)
// untuk memperbolehkan subclassing, deklarasikan super class sebagai open class
open class Manusia1(
        val nama: String,
        val jenisKelamin: String = "Pria",  // default parameter untuk constructor, jadi class bisa di-instantiate
        var umur: Int = 1                   // dengan Manusia1("Budi") -> jenis kelamin Pria dan umur 1
) {
    fun ulangTahun() = this.umur++
}

class Mahasiswa(nama: String,
                jenisKelamin: String,
                umur: Int = 17,
                val jurusan: String): Manusia1(nama, jenisKelamin, umur) /* extends pada kotlin, langsung
                                                                          * memanggil constructor super class */

// data class pada kotlin secara implicit mendefinisikan setter (hanya untuk var), getter, toString, hashCode, copy
// equals, componentN (untuk class destructure)
data class Manusia2(val nama: String,
                    val jenisKelamin: String = "Pria",
                    var umur: Int = 1)

fun main(args: Array<String>) {
    val budi = Manusia("Budi", "Pria", 20)  // instantiate object

    println("Nama: ${budi.nama}, Jenis Kelamin: ${budi.jenisKelamin}, Umur: ${budi.umur}")
    budi.ulangTahun()
    println("Nama: ${budi.nama}, Jenis Kelamin: ${budi.jenisKelamin}, Umur: ${budi.umur}")

    val agus = Mahasiswa("Agus", "Pria", jurusan="Teknik Informatika") // umur default 17

    println("Nama: ${agus.nama}, Jenis Kelamin: ${agus.jenisKelamin}, Umur: ${agus.umur}, Jurusan: ${agus.jurusan}")

    val susi = Manusia2("Susi", "Wanita", 27)

    println("Manusia2 Susi: $susi")

    val susi1 = susi.copy() // copy semua atribut

    println("Susi == Tuti: ${susi == susi1}")   // equals
    println("Susi === Tuti: ${susi === susi1}") // identity

    val tuti = susi.copy(nama="Tuti") // copy dengan atribut nama diganti

    // destructuring
    val (nama, jenisKelamin, umur) = tuti
    println("nama: $nama, jenis kelamin: $jenisKelamin, umur: $umur")

    // polymorphism
    val data = listOf(Manusia1("Budi", "Pria", 20), Mahasiswa("Agus", "Pria", 20, "Teknik Informatika"),
            Manusia1("Susi", "Wanita", 20), Mahasiswa("Tuti", "Wanita", 22, "Sistem Informasi"))

    data.forEach {
        println("Nama: ${it.nama}")
        println("Umur: ${it.umur}")
        println("Jenis Kelamin: ${it.jenisKelamin}")
        if (it is Mahasiswa) // smart cast
            println("Jurusan: ${it.jurusan}")
        println("====================")
    }
}
