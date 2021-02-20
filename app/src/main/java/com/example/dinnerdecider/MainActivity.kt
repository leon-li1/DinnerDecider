package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private val foodList = arrayListOf("Burger King", "Pizza Pizza", "Osmows")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randIndex = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randIndex]
        }

        addFoodBtn.setOnClickListener {
            if (addFoodTxt.text.isNotEmpty()) {
                val newFood = addFoodTxt.text.toString()
                foodList.add(newFood)
                addFoodTxt.setText("")
            }
        }
    }
}