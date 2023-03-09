package com.kooapps.stackybir.frgthyhyhy

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.kooapps.stackybir.ggthigt.GagogogaaammyyActivity2
import com.kooapps.stackybir.R
import com.kooapps.stackybir.gtojigtjitg.VebobooooActivity2
import com.kooapps.stackybir.bghhyhyhy.PapapapapapapClas.Companion.ju5uj5ujuj
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class FilalalaaaaaaActivity2 : AppCompatActivity() {

    fun hh5y5hy9hy(frjifrjirfjigt: String) {
        OneSignal.setExternalUserId(
            frjifrjirfjigt,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val ujujgtrfrfrfrf = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $ujujgtrfrfrfrf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val gtgthyhyhyhy =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $gtgthyhyhyhy"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val dderffgrgtgtgt = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $dderffgrgtgtgt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    fun gthigthigthgthugt() {

        val gt59gt59hy59hy = ju5uj5ujuj["AppsData"]
        val bnnmjjm = ju5uj5ujuj["FBData"]
        val hyhy2ju = ju5uj5ujuj["GAID"]
        val xxccfc = ju5uj5ujuj["View"]
        val cvfgtgtgt = ju5uj5ujuj["GeoHose"]
        val gthyhyhyhy = ju5uj5ujuj["GEO"]
        val hy59ju5ju59uj = ju5uj5ujuj["AppsCh"]
        val h2ju59uj5ju95 = MyTracker.getTrackerParams()

        h2ju59uj5ju95.setCustomUserId(hyhy2ju)
        hh5y5hy9hy(hyhy2ju.toString())


        val hy2ju62ol = getSharedPreferences("NEWPR", Context.MODE_PRIVATE)

        val hyuj2ik2ikki = MyTracker.getInstanceId(applicationContext)

        val nhyjihyjihy = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val gtjogtjogtjogti = Build.VERSION.RELEASE
        val h2j2u6uj26uj = "sub_id_5="
        val juy5j9ju = "naming"
        val hy5ju95ju9uj = "orgdeep"
        val hy262uj6juju26ju26 = "organika"
        val ghh555 = "deep"

        val hhyujuj59 = "sub_id_1="
        val hyhy5hy9 = "ad_id="
        val hy59hy59 = "deviceID="
        val bhjuuj2 = "sub_id_4="


        var loloolollool = ""

        when (hy59ju5ju59uj) {
            "1" ->
                if (gt59gt59hy59hy != "null") {
                    loloolollool =
                        "$xxccfc$hhyujuj59$gt59gt59hy59hy&$hy59hy59$nhyjihyjihy&$hyhy5hy9$hyhy2ju&$bhjuuj2$gtjogtjogtjogti&$h2j2u6uj26uj$juy5j9ju"

                    hy2ju62ol.edit().putString("link", loloolollool).apply()
                    hy2ju62ol.edit().putString("ENTRY_CODE", "web").apply()

                    Toast.makeText(this, "${loloolollool}", Toast.LENGTH_SHORT).show()

                    stararttvbbbbbbbbb()
                    fgriojgtojgtjigtj()
                } else if (bnnmjjm != null || cvfgtgtgt!!.contains(gthyhyhyhy.toString())) {
                    loloolollool =
                        "$xxccfc$hhyujuj59$bnnmjjm&$hy59hy59$nhyjihyjihy&$hyhy5hy9$hyhy2ju&$bhjuuj2$gtjogtjogtjogti&$h2j2u6uj26uj$hy5ju95ju9uj"
                    hy2ju62ol.edit().putString("link", loloolollool).apply()
                    hy2ju62ol.edit().putString("ENTRY_CODE", "web").apply()

                    Toast.makeText(this, "${loloolollool}", Toast.LENGTH_SHORT).show()

                    stararttvbbbbbbbbb()
                    fgriojgtojgtjigtj()
                } else {

                    startActivity(Intent(this, GagogogaaammyyActivity2::class.java))
                    fgriojgtojgtjigtj()
                }
            "0" ->
                if (bnnmjjm != null) {
                    loloolollool =
                        "$xxccfc$hhyujuj59$bnnmjjm&$hy59hy59$hyuj2ik2ikki&$hyhy5hy9$hyhy2ju&$bhjuuj2$gtjogtjogtjogti&$h2j2u6uj26uj$ghh555"
                    hy2ju62ol.edit().putString("link", loloolollool).apply()
                    hy2ju62ol.edit().putString("ENTRY_CODE", "web").apply()

                    Toast.makeText(this, "${loloolollool}", Toast.LENGTH_SHORT).show()

                    stararttvbbbbbbbbb()
                    fgriojgtojgtjigtj()

                } else if (cvfgtgtgt!!.contains(gthyhyhyhy.toString())) {
                    loloolollool = "$xxccfc$hy59hy59$hyuj2ik2ikki&$hyhy5hy9$hyhy2ju&$bhjuuj2$gtjogtjogtjogti&$h2j2u6uj26uj$hy262uj6juju26ju26"
                    hy2ju62ol.edit().putString("link", loloolollool).apply()
                    hy2ju62ol.edit().putString("ENTRY_CODE", "web").apply()
                    Toast.makeText(this, "${loloolollool}", Toast.LENGTH_SHORT).show()

                    stararttvbbbbbbbbb()
                    fgriojgtojgtjigtj()
                } else {

                    startActivity(Intent(this, GagogogaaammyyActivity2::class.java))
                    fgriojgtojgtjigtj()
                }
        }
    }

    private fun stararttvbbbbbbbbb() {
        startActivity(Intent(this, VebobooooActivity2::class.java))
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filalalaaaaaa2)
        gthigthigthgthugt()
    }

    private fun fgriojgtojgtjigtj() {
        finish()
    }

}