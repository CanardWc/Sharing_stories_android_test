package com.example.story_instagram_and_facebook_api_testing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // storing ID of the button
        // in a variable
        val button1 = findViewById<Button>(R.id.button1)

        // operations to be performed
        // when user tap on the button
        button1?.setOnClickListener()
        {
            // displaying a toast message
            Toast.makeText(this@MainActivity, R.string.message_btn1, Toast.LENGTH_LONG).show()
        }

        // storing ID of the button
        // in a variable
        val button2 = findViewById<Button>(R.id.button2)

        // operations to be performed
        // when user tap on the button
        button2?.setOnClickListener()
        {
            // displaying a toast message
            Toast.makeText(this@MainActivity, R.string.message_btn2, Toast.LENGTH_LONG).show()
        }
    }
}