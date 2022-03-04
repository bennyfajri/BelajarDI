package com.drsync.belajardi

import android.content.Context
import dagger.Component

@Component
interface BattleComponent {
    fun inject(context: MainActivity)
}