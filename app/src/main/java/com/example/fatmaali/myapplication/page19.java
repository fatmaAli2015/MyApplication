package com.example.fatmaali.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class page19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page19);
        TextView txtview = (TextView) findViewById(R.id.textView_txt);
//        InputStream input = null;
//
//
//        try {
//            input = getAssets().open("android.txt");
//            int size=  input.available();
//            byte[] addtxt = new byte[size];
//            input.read(addtxt);
//            input.close();
//            String txt = new String(addtxt);
//            txtview.setText(txt);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        StringBuilder stringBuilder = new StringBuilder();
        InputStream ism= null;
        try {
            ism = getAssets().open("android.txt");
            InputStreamReader isr = new InputStreamReader(ism);
            BufferedReader br = new BufferedReader(isr);

            String line;
            try {
                while ((line = br.readLine())!= null)
                {
                    stringBuilder.append(line);
                    stringBuilder.append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
       txtview.setText(stringBuilder);
    }
}
