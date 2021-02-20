package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private val foodList = arrayListOf("Burger King", "Pizza Pizza", "Osmows")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val decideBtn = findViewById<Button>(R.id.decideBtn)
        val selectedFoodTxt = findViewById<TextView>(R.id.selectedFoodTxt)
        val addFoodBtn = findViewById<Button>(R.id.addFoodBtn)
        val addFoodTxt = findViewById<TextView>(R.id.addFoodTxt)

        decideBtn.setOnClickListener {
            val random = Random()
            val randIndex = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randIndex]
        }

        addFoodBtn.setOnClickListener {
            if (addFoodTxt.text.isNotEmpty()) {
                val newFood = addFoodTxt.text.toString()
                foodList.add(newFood)
                addFoodTxt.text = ""
            }
        }
    }
}