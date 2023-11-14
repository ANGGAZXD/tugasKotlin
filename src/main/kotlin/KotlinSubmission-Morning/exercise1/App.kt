
/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan : String = "Angga"
    val namaBelakang : String = "Situmorang"
    val umur : Int = 20
    val single : Boolean = true

    println("Nama Saya adalah $namaDepan $namaBelakang yang berumur $umur Tahun dan status Single Saya adalah $single")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Member: $groupMember")
    println("Session: $session")
    return "Grup Saya adalah Grup $groupId beranggotakan $groupMember dengan Sesi $session"
}


/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val anggota = listOf("Angga", "Naufal","Tria","Irfan","Syahrul")
    anggota[0]
    return anggota
}


/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Rey","Kak Megy", "Kak Jovian", "Kak maul", "Kak Reza")
    val countOfGroup = arrayOf<String>("Aku", "Naufal", "Tria","Ifran","Syahrul")

    val total = mentor.size + countOfGroup.size
    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Waktu Indonesia Bercanda", listOf("Angga", "Naufal","Tria","Ifran","Syahrul"), "Pagi")

}