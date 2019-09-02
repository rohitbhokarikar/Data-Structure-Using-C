package com.rohit.com.datastructureusingc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import rb.rohit.com.datastructureusingclanguage.R;

public class SelectonsortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectonsort);


        WebView minShow = (WebView)findViewById(R.id.webView);
        minShow.loadUrl("file:///android_asset/selectionsort.html");
        WebSettings settings = minShow.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setLoadWithOverviewMode(true);

    }
}
