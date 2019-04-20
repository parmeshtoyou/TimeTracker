package com.timetracker.param.timetracker.activities

import android.content.Intent
import android.os.Bundle
import com.timetracker.param.timetracker.R

class SplashActivity : BaseActivity() {


    override fun gotoLoginPage() {
        val intent = Intent(this, LoginActivity::class.java)
        intent.apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        launchActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    companion object {
        val TAG = SplashActivity::class.simpleName
    }
}
