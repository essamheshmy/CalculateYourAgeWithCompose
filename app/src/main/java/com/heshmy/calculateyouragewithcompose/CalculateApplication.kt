package com.heshmy.calculateyouragewithcompose

import android.app.Application
import android.content.Context

class CalculateApplication: Application() {
    init {
        application =this
    }
    companion object{
        private  lateinit var application: CalculateApplication
        fun gitApplicationContext(): Context = application.applicationContext
    }
}