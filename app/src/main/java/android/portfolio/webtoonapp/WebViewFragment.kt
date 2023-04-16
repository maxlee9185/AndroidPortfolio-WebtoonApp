package android.portfolio.webtoonapp

import android.os.Bundle
import android.portfolio.webtoonapp.databinding.FragmentWebviewBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment

class WebViewFragment :Fragment()  {
    private lateinit var binding :FragmentWebviewBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWebviewBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.webView.webViewClient = WebtoonWebViewClient(binding.webViewProgressBar)
        binding.webView.settings.javaScriptEnabled = true
        binding.webView.loadUrl("https://comic.naver.com/webtoon/detail?titleId=648419&no=380")
    }

    fun canGoBack():Boolean{
        return binding.webView.canGoBack()
    }
    fun goBack(){
        binding.webView.goBack()
    }
}