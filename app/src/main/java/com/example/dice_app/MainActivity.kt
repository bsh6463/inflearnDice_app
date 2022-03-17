package com.example.dice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val diceImage1 = binding.diceImage1
        val diceImage2 = binding.diceImage2

        binding.diceStartBtn.setOnClickListener {
            Toast.makeText(this, "gogo", Toast.LENGTH_LONG).show()

            setImage(Random.nextInt(1, 6), diceImage1)
            setImage(Random.nextInt(1, 6), diceImage2)

        }
    }

    private fun setImage(num: Int, diceImageView: ImageView){
        when(num){
            1 -> {diceImageView.setImageResource(R.drawable.dice_1)}
            2 -> {diceImageView.setImageResource(R.drawable.dice_2)}
            3 -> {diceImageView.setImageResource(R.drawable.dice_3)}
            4 -> {diceImageView.setImageResource(R.drawable.dice_4)}
            5 -> {diceImageView.setImageResource(R.drawable.dice_5)}
            6 -> {diceImageView.setImageResource(R.drawable.dice_6)}
        }
    }
}