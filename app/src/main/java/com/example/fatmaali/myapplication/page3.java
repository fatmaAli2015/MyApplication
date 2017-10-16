package com.example.fatmaali.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }
     int index=0;
    int[] arpic = new int[]{R.drawable.download,R.drawable.download1,R.drawable.download2};
    public void bunext(View view) {
        ImageView mypic = (ImageView) findViewById(R.id.imageView);
        mypic.setImageResource(arpic[index]);
        index++;
        if(index>2)
            index=0;
    }
}
