package com.jetpack.dagger

import android.util.Log
import javax.inject.Inject

private const val TAG = "ServiceProvider"
class ServiceProvider @Inject constructor(){
  init {
     Log.i(TAG,"Service provider constructed")
  }

    fun getServiceProvider(){
        Log.i(TAG,"Service provider connected")
    }
}