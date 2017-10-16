package com.example.fatmaali.myapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class page13 extends AppCompatActivity {
    EditText edtxtshpr;
    TextView txtshpr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page13);
        edtxtshpr=(EditText)findViewById(R.id.edtxt_shpr);
        txtshpr=(TextView)findViewById(R.id.txt_shpr);
    }

    public void btn_saveshpr(View view) {
        SharedPreferences shr =getSharedPreferences("savefile", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= shr.edit();
        editor.putString("name",edtxtshpr.getText().toString());
        editor.apply();
    }

    public void btn_loadshpr(View view) {
        SharedPreferences shr =getSharedPreferences("savefile", Context.MODE_PRIVATE);
        String txt = shr.getString("name"," No_Data");
        txtshpr.setText(txt);
    }
}
