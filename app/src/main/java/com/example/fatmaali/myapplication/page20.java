package com.example.fatmaali.myapplication;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class page20 extends AppCompatActivity {
    ImageView imageViewGallery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page20);
        TextView textView = (TextView)findViewById(R.id.textView_color);
        imageViewGallery=(ImageView)findViewById(R.id.imageView_gallery);


        if (Build.VERSION.SDK_INT >= 24) {
           textView.setText(Html.fromHtml(" <font color=\"#FF00000\"> Quran</font>", 1));  // for 24 api and more
        } else {
          textView.setText(Html.fromHtml(" <font color=\"#FF00000\"> Quran</font>")); // or for older api
        }

        ListView listView =(ListView)findViewById(R.id.listview_txt);
       // String[] item = getResources().getStringArray(R.array.index);
          String[] item = new String[26];
       // StringBuilder stringBuilder = new StringBuilder();
        InputStream ism= null;
        try {
            ism = getAssets().open("list.txt");
            InputStreamReader isr = new InputStreamReader(ism);
            BufferedReader br = new BufferedReader(isr);

            String line;
            int id=0;
            try {
                while ((line = br.readLine())!= null)
                {
                   item[id]=line;
                    id++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
//        txtview.setText(stringBuilder);


        ListAdapter listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item);
        listView.setAdapter(listAdapter);
    }

    final int PIC_CROP = 1;
    public void btn_Gallery(View view) {

            Intent GalleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            startActivityForResult(GalleryIntent,PIC_CROP);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==PIC_CROP&& resultCode==RESULT_OK){
            Uri uri = data.getData();
            imageViewGallery.setImageURI(uri);         // for gallery without storing

        }
    }
}
