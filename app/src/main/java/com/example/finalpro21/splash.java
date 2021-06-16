package com.example.finalpro21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {
ImageView imageView;
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView=(ImageView) findViewById(R.id.splashImg);
        txt=(TextView) findViewById(R.id.txtWelcome);

        new Thread() {
            public void run(){

                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(splash.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }

        }.start();
    }

}