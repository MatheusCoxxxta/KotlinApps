package com.matheuscosta.githubsearchkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Skills List"
        val skillList = arrayListOf<String>()
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, skillList)

        if (skillList.isEmpty()) skillListLabel.text = ""

        addButton.setOnClickListener(View.OnClickListener {
            val skill: String = skillField.text.toString()

            if(skill.isBlank()) {
                Snackbar
                    .make(screen, "Digite uma skill!", Snackbar.LENGTH_LONG)
                    .setAction("Ok") {}
                    .show()
            } else {
                skillList.add(skill)
                if (skillList.isNotEmpty()) skillListLabel.text = getString(R.string.result_label)

                listView.adapter = adapter
                adapter.notifyDataSetChanged()
                skillField.text.clear()
            }
        })
    }
}