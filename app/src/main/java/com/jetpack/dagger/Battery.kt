package com.jetpack.dagger

import android.util.Log
import javax.inject.Inject

private const val TAG = "Battery"

interface Battery {

    fun getPower()

}