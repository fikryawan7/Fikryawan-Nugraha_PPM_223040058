/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
// Bagian 1: Program PersegiPanjang
fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Masukkan panjang dan lebar sebagai argumen nya.")
        return
    }

    val panjang = args[0].toIntOrNull()
    val lebar = args[1].toIntOrNull()

    if (panjang == null || lebar == null) {
        println("Input tidak valid, masukkan angka.")
        return
    }

    val luas = panjang * lebar
    val keliling = 2 * (panjang + lebar)

    println("Panjang: $panjang")
    println("Lebar: $lebar")
    println("Luas: $luas")
    println("Keliling: $keliling")
}
