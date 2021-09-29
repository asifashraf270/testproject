package com.asif.localcacheProject.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.databinding.DataBindingUtil
import com.asif.localcacheProject.BaseActivity
import com.asif.localcacheProject.R
import com.asif.localcacheProject.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : BaseActivity() {
    lateinit var binding: ActivitySplashScreenBinding
    override fun setUpBinding() {

    }

    override fun registerEventObserver() {
    }

    override fun registerSingleEventObserver() {
    }

    override fun initilization() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash_screen)
        var timer = object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
            }

            override fun onFinish() {
                var intent = Intent(this@SplashScreenActivity, LoginScreenActivity::class.java)
                startActivity(intent)
            }
        }
        timer.start()
    }
}