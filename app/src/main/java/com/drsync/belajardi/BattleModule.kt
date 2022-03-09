package com.drsync.belajardi

import com.drsync.belajardi.Constant.Companion.CADANGAN
import com.drsync.belajardi.Constant.Companion.UTAMA
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object BattleModule {
    @Singleton
    @Provides
    @Named(UTAMA)
    fun provideSenjata(): Senjata {
        return Senjata("Pedang Lava", "Tombak Halilintar")
    }

    @Singleton
    @Provides
    @Named(CADANGAN)
    fun provideSenjataCadangan(): Senjata {
        return Senjata("Pedang Naga", "Tombak Golem")
    }
}