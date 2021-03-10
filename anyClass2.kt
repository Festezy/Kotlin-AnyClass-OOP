package app

import data.AnyClassD.MahasiswaAnyClass2

//fun printMahasiswa2(obj: Any){
//    if (obj is MahasiswaAnyClass2){
//        println("""
//                    Data Mahasiswa
//            Nama Mahasiswa : ${obj.nama}
//            NIM            : ${obj.nim}
//            Jurusan        : ${obj.jurusan}
//            Mata Kuliah    : ${obj.mataKuliah}
//        """.trimIndent())
//    } else { println(obj) }
//}

fun printMahasiswa2(obj: Any){
    when (obj ){
        is MahasiswaAnyClass2 ->
            println("""
                    Data Mahasiswa
            Nama Mahasiswa : ${obj.nama}
            NIM            : ${obj.nim}
            Jurusan        : ${obj.jurusan}
            Mata Kuliah    : ${obj.mataKuliah}
        """.trimIndent())
        else -> { println(obj)}
    }
}



fun main() {
    printMahasiswa2(MahasiswaAnyClass2("Andrean", 123456, "TIK", "Teknik Informatika"))

}