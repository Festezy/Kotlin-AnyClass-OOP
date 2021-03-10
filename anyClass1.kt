package app

import data.AnyClassD.*

///** Menggunakan if else*/
//fun printMahasiswa(Obj: Any){
//    if (Obj is Mahasiswa2AnyClass){
//        println("Nama Mahasiswa: ${Obj.name}")
//    } else if (Obj is nim){
//        println("NIM: ${Obj.nim}")
//    } else if (Obj is Jurusan){
//        println("Jurusan: ${Obj.Jurusan}")
//    } else if (Obj is MataKuliah){
//        println("Mata Kuliah: ${Obj.mataKuliah}")
//    } else { println(Obj)}
//}
/** Menggunakan When*/
fun printMahasiswa(Obj: Any){

    when (Obj)
    {
        is MahasiswaAnyClass1 -> { println("${Obj.heading}".toUpperCase())}
        is Nama -> { println("Nama Mahasiswa : ${Obj.name}".toUpperCase()) }
        is Nim -> { println("NIM            : ${Obj.nim}".toUpperCase()) }
        is Jurusan -> { println("Jurusan        : ${Obj.Jurusan}".toUpperCase()) }
        is MataKuliah -> { println("Mata Kuliah    : ${Obj.mataKuliah}".toUpperCase()) }
        else -> { println(Obj) }
    }
}

fun main() {

    printMahasiswa(MahasiswaAnyClass1("Data Mahasiswa"))
    printMahasiswa(Nama("Ariq"))
    printMahasiswa(Nim(654321))
    printMahasiswa(Jurusan("TIK"))
    printMahasiswa(MataKuliah("Kotlin Object Oriented"))
    printMahasiswa("")
}