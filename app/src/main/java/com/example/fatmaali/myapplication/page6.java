package com.example.fatmaali.myapplication;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class page6 extends AppCompatActivity {
    TextView txtcounter;
    counterm counter;
    int index =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);
        txtcounter=(TextView)findViewById(R.id.txtcounter);
    }

    public void bustart(View view) {
        starttime();
    }

    public void buend(View view) {
        counter.cancel();
    }

    public void starttime() {
     counter = new counterm(1000,100);
     counter.start();
    }


    class counterm extends CountDownTimer {

        public counterm(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long l) {
         txtcounter.setText(String.valueOf(index));
            index++;
        }

        @Override
        public void onFinish() {
            starttime();
        }
    }
}