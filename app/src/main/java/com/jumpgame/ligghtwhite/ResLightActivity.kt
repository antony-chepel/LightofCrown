package com.jumpgame.ligghtwhite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.jumpgame.R

class ResLightActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_res_light)
        val b_ligts = findViewById<Button>(R.id.b_back_light)
        val text_b = findViewById<TextView>(R.id.tv_bonus_light)
        val bonus = intent.getIntExtra("bonus",0)
        text_b.text = "You received $bonus"
        b_ligts.setOnClickListener {
            startActivity(Intent(this,MainLightScreen::class.java))
        }

    }
}