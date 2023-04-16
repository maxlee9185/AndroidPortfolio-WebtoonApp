package android.portfolio.webtoonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.portfolio.webtoonapp.databinding.ActivityMainBinding
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root )

        val button1 = binding.button1
        val button2 = binding.button2

        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainer,WebViewFragment())
                commit()
            }
        }

        button2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainer,BFragment())
                commit()
            }
        }
    }

    override fun onBackPressed() {
        val currentFragment=supportFragmentManager.fragments[0]
        if(currentFragment is WebViewFragment){
            if(currentFragment.canGoBack()){
                currentFragment.goBack()
            }
            else super.onBackPressed()
        }
        else{
            super.onBackPressed()
        }
    }
}