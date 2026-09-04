package com.example.petshop

class Happy(date: String): Mood(date) {
    override fun describe(): String {
        return "Feeling Happy!"
        }
}

