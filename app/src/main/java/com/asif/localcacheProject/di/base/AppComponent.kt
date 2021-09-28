package com.asif.localcacheProject.di.base

import android.app.Application
import com.asif.localcacheProject.BaseApplication
import com.asif.localcacheProject.di.base.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class])
interface AppComponent : AndroidInjector<BaseApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder
        fun build(): AppComponent

    }

    override fun inject(app: BaseApplication)

}