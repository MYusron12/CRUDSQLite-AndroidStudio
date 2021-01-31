package com.example.daftarmahasiswacrud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Atur layar supaya ga ada judul ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);


        //Untuk tampilan Fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gotologin = new Intent(splashScreen.this, login.class);
                startActivity(gotologin);
                finish();
            }
        }, 5000);
    }
}
