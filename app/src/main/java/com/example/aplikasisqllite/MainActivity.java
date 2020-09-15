package com.example.aplikasisqllite;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



public class MainActivity extends Activity {
    private int waktu_loading=10000;
    //4000=4detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent login = new Intent(MainActivity.this, Login.class);
                startActivity(login);
                finish();
            }
        }, waktu_loading);
    }
}
