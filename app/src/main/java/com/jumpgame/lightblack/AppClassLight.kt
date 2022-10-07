package com.jumpgame.lightblack

import android.app.Application
import android.content.Context
import android.util.Log
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.onesignal.OneSignal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AppClassLight : Application() {
    companion object {
        const val ISDUUQWDUQWDQ = "YmQkGihnP4KHzESZzQTSd4"
        const val ystdttqwdqw = "2c4c"
        const val TSTDTQWTDQWDQF = "ca12ee12-4986-44a4-b9c7-67a8f0ceda15"

        val tysdyuuwqid = "http://lightofcrown"
        val odwqpdoqowdoqw = ".xyz/go.php?to=1&"
        val bxgdghdjwqjdqjw = "http://lightofcrown"
        val gsgdhwqiiokdlwqkk = ".xyz/apps.txt"


        val ggsdhiqwidmwqidqw = "sub_id_1="

        var XVVXCGSGACGSAC: String? = ""
        var JKSKDKWQDOQWOD: String? = "c11"
        var VXVCGSAGCQWHDQWJD: String? = "d11"

    }

    override fun onCreate() {
        super.onCreate()

        GlobalScope.launch(Dispatchers.IO) {
            tstrdrqwdqwdqwdqw(context = applicationContext)
        }
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(TSTDTQWTDQWDQF)


    }

    private suspend fun tstrdrqwdqwdqwdqw(context: Context) {
        val advertisingInfo = DivineAdv(context)
        val idInfo = advertisingInfo.hxhhfhweufwefwe()

        val prefs = getSharedPreferences("SP", Application.MODE_PRIVATE)
        val editor = prefs.edit()

        editor.putString(XVVXCGSGACGSAC, idInfo)
        editor.apply()
    }
}

class DivineAdv (context: Context) {
    private val adInfo = AdvertisingIdClient(context.applicationContext)
    suspend fun hxhhfhweufwefwe(): String =
        withContext(Dispatchers.IO) {
            adInfo.start()
            val adIdInfo = adInfo.info
            Log.d("getAdvertisingId = ", adIdInfo.id.toString())
            adIdInfo.id
        }
}