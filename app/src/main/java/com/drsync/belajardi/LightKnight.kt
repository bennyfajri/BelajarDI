package com.drsync.belajardi

import javax.inject.Inject

class LightKnight @Inject constructor(val senjata: Senjata) {
    fun setEquip(): String {
        return "Kelompok LightKnight Bertempur Menggunakan ${senjata.pedang()}"
    }
}