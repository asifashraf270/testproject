package com.asif.localcacheProject.di.base.module

import android.app.Application
import android.content.Context
import android.content.res.Resources
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ActivitiesModule::class,DatabaseModule::class,FragmentModule::class,PreferenceModule::class,
ServiceModule::class,ViewModelModule::class,NetworkModule::class])
class AppModule {
    @Singleton
    @Provides
    fun provideContext(application: Application): Context = application.applicationContext

    @Singleton
    @Provides
    fun provideResource(application: Application): Resources = application.resources
}