package com.example.fatmaali.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txtusername,txtpassword;

    }

    public void busubmit(View view) {
        final EditText etusername,etpassword;
        etusername= (EditText)findViewById(R.id.etusername);
        etpassword= (EditText)findViewById(R.id.etpassword);
        Intent myint = new Intent(this,Main2Activity.class);
        Bundle bundle = new Bundle();
        bundle.putString("username",etusername.getText().toString());
        bundle.putString("password",etpassword.getText().toString());
        myint.putExtras(bundle);
        startActivity(myint);
    }
}
