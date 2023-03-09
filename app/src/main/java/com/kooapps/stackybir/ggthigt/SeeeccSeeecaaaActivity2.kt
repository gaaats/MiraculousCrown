package com.kooapps.stackybir.ggthigt

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.kooapps.stackybir.R
import com.kooapps.stackybir.bghhyhyhy.PapapapapapapClas
import com.kooapps.stackybir.bghyhyyh.Ofrokfrkkfkrf
import com.kooapps.stackybir.bhyyhhy.Mfrokforf
import com.kooapps.stackybir.gthhyhyhygthhyhy.MainActivity
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class SeeeccSeeecaaaActivity2 : AppCompatActivity() {

    private fun onFailure(t: Throwable) {
        gjigtjitgigtjigtjigt(t)
    }

    private fun gjigtjitgigtjigtjigt(t: Throwable) {
        Toast.makeText(this, t.message, Toast.LENGTH_SHORT).show()
    }

    private fun onResponse(response: Mfrokforf) {
        PapapapapapapClas.ju5uj5ujuj.put("GEO", response.countryCode)
        startActivity(Intent(this, MainActivity::class.java))
    }

    private var yh59hy59hy95hy: CompositeDisposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seeecc_seeecaaa2)

        yh59hy59hy95hy = CompositeDisposable()


        val klo59ol5ol59ol = Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(Ofrokfrkkfkrf.Jjfrijjjrf::class.java)


        yh59hy59hy95hy?.add(
            klo59ol5ol59ol.gtoigtogtj()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({ response -> onResponse(response) }, { t -> onFailure(t) })
        )
    }
}