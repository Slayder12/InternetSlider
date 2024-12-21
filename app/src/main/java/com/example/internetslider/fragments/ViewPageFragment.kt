package com.example.internetslider.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.internetslider.R
import com.example.internetslider.models.Page

class ViewPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_page, container, false)
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val webViewWV = view.findViewById<WebView>(R.id.webViewWV)
        val viewPageItem = arguments?.getSerializable("page") as Page

        webViewWV.webViewClient = WebViewClient()
        webViewWV.settings.javaScriptEnabled = true

        webViewWV.loadUrl(viewPageItem.url)
    }
}