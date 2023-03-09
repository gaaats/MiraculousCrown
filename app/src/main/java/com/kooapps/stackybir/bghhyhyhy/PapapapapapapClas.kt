package com.kooapps.stackybir.bghhyhyhy

import android.app.Application
import com.my.tracker.MyTracker
import com.onesignal.OneSignal

class PapapapapapapClas:Application() {

    companion object {
        var ju5uj5ujuj: HashMap<String, String> = HashMap()
        val onennenesss = "595ddec3-149a-4085-90d8-2b5f770d8c51"
        val agthyhyhyhyMyTracker = "36639552498143500972"
    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        rfgjgtjiigtgtjigtijgti()
        val hy59hy59hy5hy5 = MyTracker.getTrackerConfig()
        hy59hy59hy5hy5.isTrackingLaunchEnabled = true
        MyTracker.initTracker(agthyhyhyhyMyTracker, this)
    }

    private fun rfgjgtjiigtgtjigtijgti() {
        OneSignal.setAppId(onennenesss)
    }
}