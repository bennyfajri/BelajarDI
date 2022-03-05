package com.drsync.belajardi

import dagger.Module
import dagger.Provides

@Module
class BattleModule {
    @Provides
    fun setSenjata(): Senjata {
        return Senjata("Pedang Lava", "Tombak Halilintar")
    }
}