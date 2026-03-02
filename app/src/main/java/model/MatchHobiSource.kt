package com.example.praktam2.model

import com.example.praktam2.R

object MatchHobiSource {

    val dummyHobi = listOf(

        Hobi(
            nama = "Musik",
            deskripsi = "Komunitas pecinta musik dan konser",
            jumlahMinat = 50,
            imageRes = R.drawable.musik
        ),

        Hobi(
            nama = "Olahraga",
            deskripsi = "Futsal, basket, dan gym bareng",
            jumlahMinat = 35,
            imageRes = R.drawable.sport2
        ),

        Hobi(
            nama = "Game",
            deskripsi = "Mabar dan turnamen e-sport",
            jumlahMinat = 60,
            imageRes = R.drawable.game
        )
    )
}