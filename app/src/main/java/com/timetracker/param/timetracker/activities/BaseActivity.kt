package com.timetracker.param.timetracker.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.CountDownTimer
import android.util.Log

abstract class BaseActivity : AppCompatActivity() {

    abstract fun gotoLoginPage()

    fun launchActivity(intent : Intent) {
        startActivity(intent)
    }

    override fun onResume() {
        super.onResume()

        val countDownTimer = object : CountDownTimer(3000L, 1) {
            override fun onFinish() {
                Log.d(SplashActivity.TAG, "ON FINISHED")
                gotoLoginPage()
            }

            override fun onTick(millisUntilFinished: Long) {
                Log.d(SplashActivity.TAG, "ON TICK")
            }
        }
        countDownTimer.start()
    }
}
