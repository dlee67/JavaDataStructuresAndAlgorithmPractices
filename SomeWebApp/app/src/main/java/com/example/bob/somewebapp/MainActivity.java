package com.example.bob.somewebapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.webView);
        //I can hardly find any information about android_asset.
        //For now, if I want to fetch the file inside the asset,
        //let's just know that anroid_asset is needed.
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/www/index.html");
        //webView.loadUrl("http://10.0.2.2:58010/index.html"); //Because using localhost means
                                                             //local to the emulator.
                                                            //But this line is not working.

    }
}
