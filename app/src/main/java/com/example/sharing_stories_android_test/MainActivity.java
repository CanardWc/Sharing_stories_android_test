package com.example.sharing_stories_android_test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
                Uri backgroundAssetUri = Uri.parse("android.resource://com.example.sharing_stories_android_test/drawable/lee_boss.jpeg");

                Intent intent = new Intent("com.facebook.stories.ADD_TO_STORY");
                intent.setDataAndType(backgroundAssetUri, "image/*");
                intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                intent.putExtra("com.facebook.platform.extra.APPLICATION_ID", "863975147846629");
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Simple Button 1", Toast.LENGTH_LONG).show();//display the text of button1
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri backgroundAssetUri = Uri.parse("android.resource://com.example.sharing_stories_android_test/drawable/lee_boss.jpeg");

                Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
                intent.setDataAndType(backgroundAssetUri,  "image/*");
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                intent.setPackage("com.instagram.android");
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Simple Button 2", Toast.LENGTH_LONG).show();//display the text of button2
            }
        });
    }
}