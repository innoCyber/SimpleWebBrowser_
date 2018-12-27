package com.example.innocyber.simplewebbrowser;

import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class MyWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        CookieManager.getInstance().setAcceptCookie(true);
        return true;
    }
}