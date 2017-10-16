package com.example.fatmaali.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class page10 extends AppCompatActivity {
    WebView webView;
    EditText edtURL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page10);
       webView=(WebView)findViewById(R.id.webview);
        Button BtnGo =(Button)findViewById(R.id.btn_go);
        edtURL = (EditText)findViewById(R.id.edtxt_url);
        webView.setWebViewClient(new WebViewClient());
        BtnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.loadUrl(edtURL.getText().toString());

            }
        });
    }

//    public void btn_Go(View view) {
//    }
}
