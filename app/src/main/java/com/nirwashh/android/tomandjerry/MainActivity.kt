package com.nirwashh.android.tomandjerry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.ALPHA
import androidx.core.view.isVisible
import com.nirwashh.android.tomandjerry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var b: ActivityMainBinding
    var isTomVisible = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.imgTom.setOnClickListener {
            if (isTomVisible) eraseTom() else eraseJerry()
        }

    }
    private fun eraseTom() {
        b.imgTom.animate().alpha(0F).scaleX(0.5F).scaleY(0.5F).rotation(360F).duration = 2500
        b.imgJerry.animate().alpha(1F).scaleX(1F).scaleY(1F).rotation(-360F).duration = 2500
        isTomVisible = false
    }
    private fun eraseJerry() {
        b.imgTom.animate().alpha(1F).scaleX(1F).scaleY(1F).rotation(-360F).duration = 2500
        b.imgJerry.animate().alpha(0F).scaleX(0.5F).scaleY(0.5F).rotation(360F).duration = 2500
        isTomVisible = true
    }
}