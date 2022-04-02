package com.example.dice_rollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{rollDice()}
    }

    private fun rollDice(){
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceRoll2 = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceImage2: ImageView = findViewById(R.id.imageView2)
        val pass = Toast.makeText(this, "Selamat Anda Mendapat Dadu Double!!", Toast.LENGTH_SHORT)
        val passnt = Toast.makeText(this, "Anda Belum Beruntung!", Toast.LENGTH_SHORT)
        when (diceRoll) {
            1 -> {diceImage.setImageResource(R.drawable.dice_1)}
            2 -> {diceImage.setImageResource(R.drawable.dice_2)}
            3 -> {diceImage.setImageResource(R.drawable.dice_3)}
            4 -> {diceImage.setImageResource(R.drawable.dice_4)}
            5 -> {diceImage.setImageResource(R.drawable.dice_5)}
            6 -> {diceImage.setImageResource(R.drawable.dice_6)}
        }
        when (diceRoll2) {
            1 -> {diceImage2.setImageResource(R.drawable.dice_1)}
            2 -> {diceImage2.setImageResource(R.drawable.dice_2)}
            3 -> {diceImage2.setImageResource(R.drawable.dice_3)}
            4 -> {diceImage2.setImageResource(R.drawable.dice_4)}
            5 -> {diceImage2.setImageResource(R.drawable.dice_5)}
            6 -> {diceImage2.setImageResource(R.drawable.dice_6)}
        }
        if (diceRoll == diceRoll2){
            pass.show()
        } else {
            passnt.show()
        }
    }
}
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}