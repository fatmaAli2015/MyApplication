package com.example.fatmaali.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class page22 extends AppCompatActivity {
   ImageView imageViewCropImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page22);
        imageViewCropImage=(ImageView)findViewById(R.id.imageView_cropImage);

    }

    final int PIC_CROP = 1;
    public void btn_cropImage(View view) {
//        try {
            Intent GalleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            //cut image
//            GalleryIntent.setType( "image/*");

            GalleryIntent.putExtra("crop", true);
            GalleryIntent.putExtra("aspectX", 1);
            GalleryIntent.putExtra("aspectY", 1);
            GalleryIntent.putExtra("outputX", 128);
            GalleryIntent.putExtra("outputY", 128);
            GalleryIntent.putExtra("return-data", true);

            startActivityForResult(GalleryIntent,PIC_CROP);

//        }
//        // respond to users whose devices do not support the crop action
//        catch (ActivityNotFoundException anfe) {
//            // display an error message
//                String errorMessage = "Whoops - your device doesn't support the crop action!";
//                Toast toast = Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT);
//                toast.show();

//        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==PIC_CROP&& resultCode==RESULT_OK  && data != null){


            //  imageViewGallery.setImageBitmap((Bitmap)data.getExtras().get("data"));// cut image

            // get the returned data
            Bundle extras = data.getExtras();
            // get the cropped bitmap
            Bitmap selectedBitmap = extras.getParcelable("data");

            imageViewCropImage.setImageBitmap(selectedBitmap);
        }
    }
}
