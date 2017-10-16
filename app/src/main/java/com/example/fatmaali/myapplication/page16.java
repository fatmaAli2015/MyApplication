package com.example.fatmaali.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.StartAppSDK;

public class page16 extends AppCompatActivity {
    private StartAppAd startAppSDK = new StartAppAd(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page16);
        StartAppSDK.init(this, "203119675", true);
        StartAppAd.showSplash(this,savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        StartAppAd.onBackPressed(this);
        super.onBackPressed();
    }

    public void btn_toast(View view) {
        Toast toast = Toast.makeText(this,"  this is a message  ",Toast.LENGTH_LONG);
        View vg = toast.getView();
        vg.setBackgroundColor(Color.parseColor("#5D0Bff"));
        toast.setGravity(Gravity.LEFT,0,0);
        toast.show();
    }
}
