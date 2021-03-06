package com.myweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * 文件名: MyWeatherApplication
 * 作者: KloseYu
 * 日期: 2021/10/24
 * 描述: Application
 */
class MyWeatherApplication : Application(){
    companion object{
        const val TOKEN ="auv03EiB3Zt9RZcn"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context =applicationContext
    }
}