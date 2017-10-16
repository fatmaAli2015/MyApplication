package com.example.fatmaali.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class page24 extends AppCompatActivity {
    VideoView videoView;
    int VN=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page24);
        videoView=(VideoView)findViewById(R.id.videoView);
    }

    public void btn_video(View view) {
        Intent intentVideo = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        if(intentVideo.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intentVideo,VN);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==VN && resultCode==RESULT_OK ){
            Uri uriVideo = data.getData();
            videoView.setVideoURI(uriVideo);
            videoView.setMediaController(new MediaController(this));
            videoView.requestFocus();
            videoView.start();
        }
    }
}
