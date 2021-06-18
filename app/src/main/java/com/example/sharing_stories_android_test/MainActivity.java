package com.example.sharing_stories_android_test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Button1 = findViewById(R.id.button1);//get id of button 1
        Button Button2 = findViewById(R.id.button2);//get id of button 2

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent sharingIntent = new Intent("com.facebook.stories.ADD_TO_STORY");
                    Uri screenshotUri = Uri.parse("android.resource://com.example.sharing_stories_android_test/drawable/lee_boss.jpeg");
                    Log.v(screenshotUri.toString(), "coucou4");
                    // InputStream stream = getContentResolver().openInputStream(screenshotUri);

                    //File media = new File("android.resource://com.example.sharing_stories_android_test/drawable/lee_boss.jpeg");
                    //Uri screenshotUri = Uri.fromFile(media);

                    sharingIntent.setType("image/jpeg");
                    sharingIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
                    sharingIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
                    // sharingIntent.putExtra("interactive_asset_uri", screenshotUri);
                    sharingIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                    sharingIntent.putExtra("com.facebook.platform.extra.APPLICATION_ID", "863975147846629");
                    startActivity(sharingIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "fail lol", Toast.LENGTH_LONG).show();
                }
                Toast.makeText(getApplicationContext(), "Simple Button 1", Toast.LENGTH_LONG).show();//display the text of button1
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent sharingIntent = new Intent("com.instagram.share.ADD_TO_STORY");
                    Uri screenshotUri = Uri.parse("android.resource://com.example.sharing_stories_android_test/drawable/lee_boss.jpeg");
                    //InputStream stream = getContentResolver().openInputStream(screenshotUri);
                    Log.v(screenshotUri.toString(), "coucou");
                    //File media = new File("android.resource://com.example.sharing_stories_android_test/drawable/lee_boss.jpeg");
                    //Uri screenshotUri = Uri.fromFile(media);
                    //System.out.println(screenshotUri);
                    sharingIntent.setType("image/jpg");
                    sharingIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
                    sharingIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                    sharingIntent.setPackage("com.instagram.android");
                    startActivity(sharingIntent);
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "fail lol", Toast.LENGTH_LONG).show();
                }
                Toast.makeText(getApplicationContext(), "Simple Button 2", Toast.LENGTH_LONG).show();//display the text of button2
            }
        });
    }
}