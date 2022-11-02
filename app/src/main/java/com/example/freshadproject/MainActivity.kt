package com.example.freshadproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.allads.adslibrarycode.CloseAds
import com.allads.adslibrarycode.showAds
import com.example.freshadproject.databinding.ActivityMainBinding
import com.learn.blinklibrary.BlinkEffect

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            BlinkEffect.blink(binding.btnNext)
            showAds(this@MainActivity, object : CloseAds {
                override fun onCloseAds() {
                    var intent = Intent(this@MainActivity, NextActivity::class.java)
                    startActivity(intent)
                }
            })
        }

    }
}