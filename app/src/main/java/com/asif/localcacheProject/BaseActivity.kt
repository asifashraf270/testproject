package com.asif.localcacheProject

import android.content.SharedPreferences
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

typealias BaseActivity = DaggerActivity

abstract class DaggerActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var sharedPreferences: SharedPreferences


    abstract fun setUpBinding()
    abstract fun registerEventObserver()
    abstract fun registerSingleEventObserver()
    abstract fun initilization()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpBinding()
        initilization()
        registerEventObserver()
        registerSingleEventObserver()
    }
}