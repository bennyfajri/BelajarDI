package com.drsync.belajardi

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val lightKnight: LightKnight,
    private val darkKnight: DarkKnight
) : ViewModel() {
    fun lightWeapon(): String{
        return lightKnight.setEquip()
    }

    fun darkWeapon(): String {
        return darkKnight.setEquip()
    }
}