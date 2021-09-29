package com.asif.localcacheProject.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.asif.localcacheProject.BaseActivity
import com.asif.localcacheProject.R
import com.asif.localcacheProject.databinding.ActivityLoginScreenBinding

class LoginScreenActivity : BaseActivity() {
    lateinit var binding: ActivityLoginScreenBinding
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
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login_screen)
    }
}