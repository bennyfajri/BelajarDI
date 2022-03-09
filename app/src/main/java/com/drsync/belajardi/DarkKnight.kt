package com.drsync.belajardi

import com.drsync.belajardi.Constant.Companion.CADANGAN
import com.drsync.belajardi.Constant.Companion.UTAMA
import javax.inject.Inject
import javax.inject.Named

class DarkKnight @Inject constructor(
    @Named(UTAMA) private var senjataUtama: Senjata,
    @Named(CADANGAN) private var senjataCadangan: Senjata
){
    fun setEquip(): String {
        return "Kelompok DarkKnight Bertempur menggunakan ${senjataUtama.tombak()} dan ${senjataCadangan.tombak()}"
    }
}