package com.drsync.belajardi

import javax.inject.Inject

class DarkKnight @Inject constructor(val senjata: Senjata) {
    fun setEquip(): String {
        return "Kelompok DarkKnight Bertempur menggunakan ${senjata.tombak()}"
    }
}