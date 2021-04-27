package com.matheuscosta.firstkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var actionBar = getSupportActionBar()

        if(actionBar != null) actionBar!!.setTitle("Mostrar valor randômico")

        val intent = this.intent
        val value = intent.getStringExtra("value")

        textValue.text = value
    }
}