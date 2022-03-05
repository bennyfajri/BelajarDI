package com.drsync.belajardi

import com.drsync.belajardi.Constant.Companion.UTAMA
import com.drsync.belajardi.Constant.Companion.CADANGAN
import dagger.Module
import dagger.Provides

@Module
class BattleModule {
    @Provides
    @Choose(UTAMA)
    fun setSenjata(): Senjata {
        return Senjata("Pedang Lava", "Tombak Halilintar")
    }

    @Provides
    @Choose(CADANGAN)
    fun setSenjataCadangan(): Senjata {
        return Senjata("Pedang Naga", "Tombak Golem")
    }
}