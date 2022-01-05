package com.jetpack.dagger

import android.util.Log
import javax.inject.Inject

private const val TAG = "SIMCard"
class SIMCard @Inject constructor(val serviceProvider: ServiceProvider){

    init {
        Log.i(TAG, "SIM Card constructed")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}