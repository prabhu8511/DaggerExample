package com.jetpack.dagger

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class MemoryCardModule (val memoryCardSize: Int){

    @Provides
    fun providesMemoryCard(): MemoryCard{
        Log.i("MYTAG","Size of memory card is $memoryCardSize")
        return MemoryCard()
    }
}