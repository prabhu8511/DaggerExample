package com.jetpack.dagger

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

private const val TAG = "SmartPhone"

@Singleton
class SmartPhone @Inject constructor(private val battery: Battery, private val simCard: SIMCard, private val memoryCard: MemoryCard){

    init {
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpaceAvailability()
        Log.i(TAG,"SmartPhone constructed")
    }

    fun makeCallWithRecording(){
        Log.i(TAG, "Calling...")
    }
}