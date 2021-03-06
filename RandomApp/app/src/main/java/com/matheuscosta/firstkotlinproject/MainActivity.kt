package com.matheuscosta.firstkotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(supportActionBar != null) supportActionBar!!.hide()

        buttonRandom.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("value", random().toString())
            startActivity(intent)
        })
    }

    private fun random(): Int {
        return Random.nextInt(until = 50) + 1
    }
}