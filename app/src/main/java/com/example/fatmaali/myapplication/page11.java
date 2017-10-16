package com.example.fatmaali.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class page11 extends AppCompatActivity {
    WebView webViewhtml;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11);
        webViewhtml=(WebView)findViewById(R.id.webviewhtml);
        webViewhtml.loadUrl("file:///android_asset/1.html");
    }

    public void btn_back(View view) {
      if(index>1){
          index--;
          webViewhtml.loadUrl("file:///android_asset"+index+".html");
      }
    }

    public void btn_next(View view) {
      if (index<8){
          index++;
          webViewhtml.loadUrl("file:///android_asset"+index+".html");
      }
    }
}
