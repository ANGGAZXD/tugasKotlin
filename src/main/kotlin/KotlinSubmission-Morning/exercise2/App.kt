package id.infinitelearning.KotlinSubmission.exercise2

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    val list = mutableListOf<Int>()

    for (i in 1..101) {
        if (i % 2 == 0) {
            list.add(i)
        }
    }
    println("$list")





    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst..."
     */
    // Buat di bawah sini
    // Inisialisasi Map dengan tipe kunci String dan nilai String
        val map: Map<String, String> = mapOf(
            "Jan" to "January",
            "Feb" to "February",
            "Mar" to "March",
            "Apr" to "April",
            "Me" to "May",
            "Jun" to "June",
            "Jul" to "July",
            "Aug" to "August",
            "Sep" to "September",
            "Okt" to "October",
            "Nov" to "November",
            "Des" to "December"
        )

        /**
         * Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
         * - Jan -> January
         * - Feb -> February
         * - Dst...
         */
        // Buat di bawah sini
        map.forEach { (singkat, panjang) ->
            println("- $singkat -> $panjang")
        }


    /**
    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
            val bulan = LocalDate.now()
            val month = DateTimeFormatter.ofPattern("MMMM")
            val birthMonth : String = "Maret"

           val monthNow =  bulan.format(month)
            println("It's {$monthNow} now, I was born in {$birthMonth}")

}