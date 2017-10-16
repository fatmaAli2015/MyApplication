package com.example.fatmaali.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class page14 extends AppCompatActivity {
 VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page14);
        videoView=(VideoView)findViewById(R.id.videoView);
        String U1="android.resource://com.example.fatmaali.myapplication/"+R.raw.vedio;
        String U2="rtsp://r5---sn-4g57kn7d.googlevideo.com/Cj0LENy73wIaNAkWpf2SaW4RhxMYDSANFC3A-ZZZMOCoAUIASARg4KLP2ba59sBYigELcGVHNkM1VFBDTDQM/5A7C19A58F0D20B46BE315392D82104B4E76FBF2.462238D3E35A29BC3DD51A3216ED8DA3ABD30607/yt6/1/video.3gp";
        Uri uri=Uri.parse(U1);
        videoView.setVideoURI(uri);
        videoView.setMediaController(new MediaController(page14.this));
        videoView.requestFocus();
        videoView.start();
        // launcher icon generate----> diff. sizes of icons
    }
}
