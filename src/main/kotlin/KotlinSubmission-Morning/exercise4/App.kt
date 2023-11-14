package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    val id = arrayOf("789", "186", "asd", "412", "abc")

    for (data in id) {
        try {
            val number : Int = data.toInt()
            println("-ID : $number")
        } catch (e: NumberFormatException) {
            println("-Perhatian!! \n ID dengan Nomor ${data} salah format,seharusnya berformat Number!.")
        }
    }

    //Pada contoh di atas merupakan sebuah kasus untuk mengecek ID yang ada,dengan
    //ID tersebut harus berbentuk Number.
}





