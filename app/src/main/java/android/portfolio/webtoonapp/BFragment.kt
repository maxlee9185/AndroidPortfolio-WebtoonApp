package android.portfolio.webtoonapp

import android.os.Bundle
import android.portfolio.webtoonapp.databinding.FragmentSecondBinding
import android.portfolio.webtoonapp.databinding.FragmentWebviewBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment

class BFragment : Fragment() {

    private lateinit var binding : FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater)
        return binding.root
    }

}