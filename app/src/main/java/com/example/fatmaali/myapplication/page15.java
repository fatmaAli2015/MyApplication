package com.example.fatmaali.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import net.margaritov.preference.colorpicker.ColorPickerDialog;

public class page15 extends AppCompatActivity {
   TextView textViewcolor;
    RelativeLayout relativeLayout;
    Button btn_color;
    int color;
    ColorPickerDialog colored;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page15);
        textViewcolor=(TextView)findViewById(R.id.textcolor);
        relativeLayout=(RelativeLayout)findViewById(R.id.layout);
        btn_color=(Button)findViewById(R.id.btn_color);
        btn_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                color= Color.parseColor("#005500");
                colored= new ColorPickerDialog(page15.this,color);
                colored.setAlphaSliderVisible(true);
                colored.setOnColorChangedListener(new ColorPickerDialog.OnColorChangedListener() {
                    @Override
                    public void onColorChanged(int i) {
                        color=i;
                        relativeLayout.setBackgroundColor(color);
                        textViewcolor.setText("#"+ Integer.toHexString(color));
                        textViewcolor.setTextColor(color);
                    }
                });
                colored.show();
            }
        });
    }
}
