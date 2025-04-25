package com.example.androidbootcamp.odev2

fun main() {
    println(fahrenhiet(36.00))
    println(dikdortgenCevre(20, 30))
    println(faktoriyel(5))
    println("Yazilan Kelimeda Bu Kadar \'A\' Harfi Var. ${harfBulmaca("berkay")} ")
    println(icAcilarToplami(5))
    println(maasHesapla(25))
    println(kotaUcretHesapla(60))
}

fun fahrenhiet(derece: Double): Double {
    val donustur = (derece * 1.8) + 32
    return donustur
}

fun dikdortgenCevre(kisaK: Int, uzunK: Int): Int {
    return (2 * kisaK) + (2 * uzunK)
}

var ikinciSayi: Int = 1
fun faktoriyel(sayi: Int): Int {
    if (sayi == 0 || sayi == 1) {
        ikinciSayi = 1
    } else {
        for (i in sayi downTo 1) {
            ikinciSayi *= i
        }
    }
    return ikinciSayi
}

var sayac = 0
fun harfBulmaca(kelime: String): Int {
    val yeniKelime = kelime.uppercase()
    for (k in yeniKelime) {
        if (k == 'A') {
            sayac += 1
            continue
        }
    }
    return sayac
}

fun icAcilarToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

var maas = 0
fun maasHesapla(gunSayi: Int): Int {
    val calismaSaat = gunSayi * 8
    if (calismaSaat <= 160) {
        maas = calismaSaat * 10
    } else {
        maas = 160 * 10
        maas = ((calismaSaat - 160) * 20) + maas
    }
    return maas
}

var ucret = 100
var sabitGB = 50
fun kotaUcretHesapla(kotaMiktari: Int): Int {
    if (kotaMiktari > 50) {
        ucret = ((kotaMiktari - sabitGB) * 4) + ucret
    }
    return ucret
}
