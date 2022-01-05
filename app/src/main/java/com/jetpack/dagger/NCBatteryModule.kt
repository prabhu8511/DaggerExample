package com.jetpack.dagger

import dagger.Binds
import dagger.Module


@Module
abstract class NCBatteryModule {

    @Binds
    abstract fun bindNCBattery(nickelCadmiumBattery: NickelCadmiumBattery) : Battery

}