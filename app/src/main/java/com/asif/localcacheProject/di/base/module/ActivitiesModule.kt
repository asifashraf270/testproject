package com.asif.localcacheProject.di.base.module

import com.asif.localcacheProject.project.LoginScreenActivity
import com.asif.localcacheProject.project.SplashScreenActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {
    @ContributesAndroidInjector
    abstract fun splashScreenActivity(): SplashScreenActivity

    @ContributesAndroidInjector
    abstract fun signInScreen(): LoginScreenActivity
}