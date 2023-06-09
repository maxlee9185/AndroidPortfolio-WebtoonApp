package android.portfolio.webtoonapp

import android.graphics.Bitmap
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar

class WebtoonWebViewClient(private val progressBar: ProgressBar) :WebViewClient( )  {

    override fun onPageFinished(view: WebView?, url: String?) {
        progressBar.visibility= View.GONE
    }

    override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
        super.onPageStarted(view, url, favicon)
        progressBar.visibility=View.VISIBLE
    }
}