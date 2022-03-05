package com.drsync.belajardi

import com.drsync.belajardi.Constant.Companion.CADANGAN
import com.drsync.belajardi.Constant.Companion.UTAMA
import javax.inject.Inject

class LightKnight @Inject constructor() {

    @Inject
    @field:Choose(UTAMA)
    lateinit var senjataUtama: Senjata

    @Inject
    @field:Choose(CADANGAN)
    lateinit var senjataCadangan: Senjata

    fun setEquip(): String {
        return "Kelompok LightKnight Bertempur Menggunakan ${senjataUtama.pedang()} dan ${senjataCadangan.pedang()}"
    }
}