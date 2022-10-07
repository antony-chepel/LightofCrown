package com.jumpgame.ligghtwhite

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.jumpgame.R
import com.jumpgame.databinding.ActivityMainLightScreenBinding

class MainLightScreen : AppCompatActivity() {
    private lateinit var bLight : ActivityMainLightScreenBinding
    private var jaiiaw: CountDownTimer? = null
    private var bonusLight = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bLight = ActivityMainLightScreenBinding.inflate(layoutInflater)
        setContentView(bLight.root)
        bLight.tvLightBonus.text = "Your bonus :x$bonusLight"
        jsjajs()
        bLight.bLightClick.setOnClickListener {
            bonusLight++
            bLight.imLightMain.animate().scaleX(0.99f).scaleY(0.99f).setDuration(0)
        }
    }

    private fun jsjajs() =with(bLight){
        var counter = 10
        jaiiaw?.cancel()
        jaiiaw = object : CountDownTimer(10000,1000){
            @SuppressLint("SetTextI18n")
            override fun onTick(millisUntilFinished: Long) {
                counter--
                if(counter >= 0) {
                    val count = counter.toString()
                    tvLightTime.text = "Time : $count sec"

                    when(counter){
                        3-> tvLightTime.setTextColor(resources.getColor(R.color.error_light))
                        2-> tvLightTime.setTextColor(resources.getColor(R.color.error_light))
                        1-> tvLightTime.setTextColor(resources.getColor(R.color.error_light))
                        0-> tvLightTime.setTextColor(resources.getColor(R.color.error_light))
                    }
                }
            }

            override fun onFinish() {
                tvLightTime.setTextColor(resources.getColor(R.color.white))
                if(counter==0){
                    counter = 10
                    startActivity(
                        Intent(this@MainLightScreen,ResLightActivity::class.java)
                            .putExtra("bonus",bonusLight)
                    )
                }


            }

        }.start()
    }
}