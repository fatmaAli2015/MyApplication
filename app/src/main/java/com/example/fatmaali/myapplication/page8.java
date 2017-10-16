package com.example.fatmaali.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class page8 extends AppCompatActivity {
    NewMessageNotification newMessageNotification = new NewMessageNotification();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);
    }

    public void BuAddNotification(View view) {
        newMessageNotification.notify(this,"Good Morning",113);
        newMessageNotification.notify(this,"Good Afternoon",112);
    }

    public void BuClearNotification(View view) {
       newMessageNotification.cancel(this);
    }
}
