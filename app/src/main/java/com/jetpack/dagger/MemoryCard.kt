package com.jetpack.dagger

import android.util.Log
import javax.inject.Inject

private const val TAG = "MemoryCard"
class MemoryCard {
 init {
     Log.i(TAG,"Memory card constructed")
 }

    fun getSpaceAvailability(){
        Log.i(TAG,"Memory space available")
    }
}