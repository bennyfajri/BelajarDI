package com.drsync.belajardi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.drsync.belajardi.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var darkKnight: DarkKnight

    @Inject
    lateinit var lightKnight: LightKnight

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val getReport = "${lightKnight.setEquip()} dan ${darkKnight.setEquip()}"
            binding.textView.text = getReport
        }
    }
}