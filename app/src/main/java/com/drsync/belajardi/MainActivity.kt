package com.drsync.belajardi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.drsync.belajardi.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    @Inject
    lateinit var darkKnight: DarkKnight
    @Inject
    lateinit var lightKnight: LightKnight

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        DaggerBattleComponent.create().inject(this)

        binding.button.setOnClickListener {
            val getReport = "${lightKnight.setEquip()} dan ${darkKnight.setEquip()}"
            binding.textView.text = getReport
        }
    }
}