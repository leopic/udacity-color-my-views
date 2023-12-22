package com.leopicado.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.leopicado.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        setListeners()

        setContentView(binding.root)
    }

    private fun setListeners() {
        val clickableViews =
            listOf(
                binding.boxOneText,
                binding.boxTwoText,
                binding.boxThreeText,
                binding.boxFourText,
                binding.boxFiveText,
                binding.constraintLayout,
                binding.buttonRed,
                binding.buttonYellow,
                binding.buttonGreen
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        val boxes = listOf<View>(binding.boxOneText, binding.boxTwoText, binding.boxThreeText, binding.boxFourText, binding.boxFiveText)

        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLACK)

            R.id.button_red -> boxes.forEach { it.setBackgroundColor(Color.RED) }
            R.id.button_yellow -> boxes.forEach { it.setBackgroundColor(Color.YELLOW) }
            R.id.button_green -> boxes.forEach { it.setBackgroundColor(Color.GREEN) }

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}