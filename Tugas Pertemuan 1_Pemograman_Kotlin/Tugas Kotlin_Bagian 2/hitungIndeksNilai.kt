// Bagian 2: Program Indeks Nilai Mata Kuliah
fun hitungIndeksNilai(nilai: Int?): String {
    return when {
        nilai == null -> "Nilai harus diisi"
        nilai in 80..100 -> "Nilai : A"
        nilai in 70..79 -> "Nilai : AB"
        nilai in 60..69 -> "Nilai : B"
        nilai in 50..59 -> "Nilai : BC"
        nilai in 40..49 -> "Nilai : C"
        nilai in 30..39 -> "Nilai : D"
        nilai in 0..29 -> "Nilai : E"
        else -> "Nilai di luar jangkauan"
    }
}

fun main(args: Array<String>) {
    val nilai = args.getOrNull(0)?.toIntOrNull() // Ambil argumen pertama sebagai input
    val output = hitungIndeksNilai(nilai)
    println(output)
}