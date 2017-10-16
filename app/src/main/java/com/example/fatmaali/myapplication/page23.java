package com.example.fatmaali.myapplication;

import android.app.WallpaperManager;
import android.service.wallpaper.WallpaperService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;

public class page23 extends AppCompatActivity {
    ImageView imageViewWallPaper;
    int imgwall=0;
    int[] imgwallpaper={R.drawable.download,R.drawable.download2,R.drawable.download1,R.drawable.example_picture};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page23);
        imageViewWallPaper=(ImageView)findViewById(R.id.imageView_wallpaper);
    }

    public void img_click(View view) {
      if(imgwall<3){
          imgwall++;
          imageViewWallPaper.setImageResource(imgwallpaper[imgwall]);
      }else {
          imgwall=0;
      }
    }

    public void btn_setWallpaper(View view) {
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setResource(imgwallpaper[imgwall]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
