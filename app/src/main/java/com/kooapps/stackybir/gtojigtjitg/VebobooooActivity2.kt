package com.kooapps.stackybir.gtojigtjitg

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.webkit.*
import android.widget.Toast

class VebobooooActivity2 : AppCompatActivity() {
    fun hyhy95hy59hy() {
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies( fgfghgthgthuigthu, true)
        val hyhy2hy62hy = fgfghgthgthuigthu.settings
        hyhy2hy62hy.javaScriptEnabled = true
        hyhy2hy62hy.useWideViewPort = true
        hyhy2hy62hy.loadWithOverviewMode = true
        hyhy2hy62hy.allowFileAccess = true
        hyhy2hy62hy.domStorageEnabled = true
        hyhy2hy62hy.userAgentString = hyhy2hy62hy.userAgentString.replace("; wv", "")
        hyhy2hy62hy.javaScriptCanOpenWindowsAutomatically = true
        hyhy2hy62hy.setSupportMultipleWindows(false)
        hyhy2hy62hy.displayZoomControls = false
        hyhy2hy62hy.builtInZoomControls = true
        hyhy2hy62hy.allowFileAccess = true
        hyhy2hy62hy.allowContentAccess = true
        hyhy2hy62hy.setSupportZoom(true)
        hyhy2hy62hy.pluginState = WebSettings.PluginState.ON
        hyhy2hy62hy.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        hyhy2hy62hy.cacheMode = WebSettings.LOAD_DEFAULT
        hyhy2hy62hy.allowContentAccess = true
        hyhy2hy62hy.mediaPlaybackRequiresUserGesture = false
    }


    private fun ju226k2ik2() {

        val hn2ju5uj955ik = Intent(Intent.ACTION_GET_CONTENT).apply {
            addCategory(Intent.CATEGORY_OPENABLE)
            type = "image/*"
        }
        val ju26ju2ju2 = Intent(Intent.ACTION_CHOOSER).apply {
            putExtra(Intent.EXTRA_INTENT, hn2ju5uj955ik)
            putExtra(Intent.EXTRA_TITLE, "Image Chooser")
        }
        startActivityForResult(Intent.createChooser(ju26ju2ju2, "File Chooser"), gtjigtjigtgtjgtjigt);
    }

    private fun h2j5uj5uj(): String {
        val h22ju2ki2ik = getSharedPreferences("NEWPR",
            Context.MODE_PRIVATE)

        val nhhy5uj95ki5ki5ik = h22ju2ki2ik.getString("link", null)
        Log.d("lolo", nhhy5uj95ki5ki5ik.toString())

        return nhhy5uj95ki5ki5ik.toString()

    }

    private val gtjigtjigtgtjgtjigt = 1
    protected var gtjgtjitgjigtigt: Int = gtjigtjigtgtjgtjigt
    var grvnghugthgthug: ValueCallback<Array<Uri>>? = null

    lateinit var fgfghgthgthuigthu: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fgfghgthgthuigthu = WebView(this)
        hyhy95hy59hy()
        setContentView(fgfghgthgthuigthu)

        fgfghgthgthuigthu.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {

                val ju59ik5ik9 = applicationContext.packageManager
                val hy5hy59ju9uj = nh2n2ju2k2kiki6("org.telegram.messenger", ju59ik5ik9)

                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (hy5hy59ju9uj) {
                        val vfcddsdeded = Intent(Intent.ACTION_VIEW)
                        vfcddsdeded.data = Uri.parse(url)
                        this@VebobooooActivity2.startActivity(vfcddsdeded)
                    } else {
                        Toast.makeText(
                            this@VebobooooActivity2,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
            }

            override fun onReceivedError(
                view: WebView?,
                errorCode: Int,
                description: String?,
                failingUrl: String?
            ) {
                Toast.makeText(this@VebobooooActivity2, description, Toast.LENGTH_SHORT).show()
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
            }
        }

        fgfghgthgthuigthu.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView?,
                filePathCallback: ValueCallback<Array<Uri>>?,
                fileChooserParams: FileChooserParams
            ):Boolean {

                grvnghugthgthug?.onReceiveValue(null)
                grvnghugthgthug = filePathCallback

                try {
                    ju226k2ik2()
                } catch (e: java.lang.Exception) {
                    Toast.makeText(this@VebobooooActivity2, e.toString(), Toast.LENGTH_LONG).show()
                }
                return true
            }
        }
        fgfghgthgthuigthu.loadUrl(h2j5uj5uj())
    }



    private fun nh2n2ju2k2kiki6(packageName: String, packageManager: PackageManager): Boolean {
        return try {
            packageManager.getPackageInfo(packageName, 0)
            true
        } catch (e: PackageManager.NameNotFoundException) {
            false
        }
    }

    var h59hy5uj5juuj5uj = false
    var nh2ju2ju59uj59uj = ""


    override fun onBackPressed() {
        if (fgfghgthgthuigthu.canGoBack()) {
            if (h59hy5uj5juuj5uj) {
                fgfghgthgthuigthu.stopLoading()
                fgfghgthgthuigthu.loadUrl(nh2ju2ju59uj59uj)
            }
            this.h59hy5uj5juuj5uj = true
            fgfghgthgthuigthu.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                h59hy5uj5juuj5uj = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == gtjigtjigtgtjgtjigt && (resultCode == RESULT_OK)) {

            if ((null == grvnghugthgthug )) {
                return;
            } else {
                val hy595ju95uj59uj: String? = data?.dataString

                if (hy595ju95uj59uj != null) {
                    val result = arrayOf(Uri.parse(hy595ju95uj59uj))
                    grvnghugthgthug?.onReceiveValue(result)
                    grvnghugthgthug = null
                }
            }
        }
    }
}