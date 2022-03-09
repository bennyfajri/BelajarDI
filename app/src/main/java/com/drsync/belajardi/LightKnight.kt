package com.drsync.belajardi

import com.drsync.belajardi.Constant.Companion.CADANGAN
import com.drsync.belajardi.Constant.Companion.UTAMA
import javax.inject.Inject
import javax.inject.Named

class LightKnight @Inject constructor(
    @Named(UTAMA) private val senjataUtama: Senjata,
    @Named(CADANGAN) private val senjataCadangan: Senjata
){
    fun setEquip(): String {
        return "Kelompok LightKnight Bertempur Menggunakan ${senjataUtama.pedang()} dan ${senjataCadangan.pedang()} "
    }
}