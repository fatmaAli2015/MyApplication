package com.example.fatmaali.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class page17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page17);
    }

    public void toast_pop(View view) {
        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.LEFT,0,0);
        LayoutInflater layoutInflater = getLayoutInflater();
        View view1 = layoutInflater.inflate(R.layout.toast_img, (ViewGroup) findViewById(R.id.ly_toast));
        TextView txt = (TextView) view1.findViewById(R.id.textView_toast);
        txt.setText(" this is message ");
        toast.setView(view1);
        View view2 = toast.getView();
        view2.setBackgroundColor(Color.BLUE);
        toast.show();
    }

}
