package com.asif.localcacheProject

import com.amitshekhar.DebugDB
import com.asif.localcacheProject.di.base.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BaseApplication:DaggerApplication() {
    private val applicationInjector = DaggerAppComponent.builder().application(this).build()

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = applicationInjector
    override fun onCreate() {
        super.onCreate()
        DebugDB.getAddressLog();
    }
}