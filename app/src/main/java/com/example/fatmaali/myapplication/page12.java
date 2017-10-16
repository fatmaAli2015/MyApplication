package com.example.fatmaali.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class page12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page12);
    }

    public void btn_delete_alert(View view) {
        final EditText edtxt_Alert = (EditText) findViewById(R.id.edtxtAlertDialog);
        AlertDialog.Builder AltDia_builder = new AlertDialog.Builder(this);
        AltDia_builder.setMessage(R.string.messageDialog)
                .setIcon(R.drawable.btton)
                .setTitle(R.string.Dialog)
                .setPositiveButton(R.string.YesAnswer, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                     edtxt_Alert.setText("");
                    }
                })
                .setNegativeButton(R.string.NoMessage, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).show();
    }
}