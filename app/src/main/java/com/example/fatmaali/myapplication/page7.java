package com.example.fatmaali.myapplication;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.NotificationCompat;
import android.view.View;

public class page7 extends AppCompatActivity {
    NotificationManager nmanager;
    static int id =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);
        nmanager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
    }

//    public void AddNotif(View view) {
//        android.support.v4.app.NotificationCompat.Builder nbuild = new NotificationCompat.Builder(this)
//                .setContentText("this is Notificaion")
//                .setContentTitle("tweet")
//                .setSmallIcon(R.drawable.download);
//
//        Intent resultIntent = new Intent(this, page6.class);
//        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
//        stackBuilder.addParentStack( page6.class);
//        stackBuilder.addNextIntent(resultIntent);
//        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
//        nbuild.setContentIntent(resultPendingIntent);
//        nbuild.addAction(R.drawable.download,"reject",resultPendingIntent);
//        nmanager.notify(id,nbuild.build());
//        id++;
//    }

    public void AddNotif(View view){
        Bitmap bmp= BitmapFactory.decodeResource(this.getResources(),R.drawable.example_picture);
        NotificationCompat.Builder nbuilder= (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setContentText("this is notification")
                .setContentTitle("tweet")
                .setSmallIcon(R.drawable.example_picture)
                .setLargeIcon(bmp)
                .setAutoCancel(true)
                .setNumber(1);
        nbuilder.setDefaults(Notification.DEFAULT_SOUND|Notification.DEFAULT_VIBRATE);
        nbuilder.setVibrate(new long[]{500,1000,500,1000,500});
        nbuilder.setSound(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vedio));

        Intent resultIntent = new Intent(this, page6.class);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack( page6.class);
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        nbuilder.setContentIntent(resultPendingIntent);
        nbuilder.addAction(R.drawable.download,"reject",resultPendingIntent);
        nmanager.notify(1,nbuilder.build());
    }

    public void RemoveNotif(View view) {
        nmanager.cancelAll();
    }


}
