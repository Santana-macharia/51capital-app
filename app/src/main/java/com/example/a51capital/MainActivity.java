package com.example.a51capital;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

                Intent register = new Intent(MainActivity.this, RegisterActivity.class);
                MainActivity.this.startActivity(register);
                MainActivity.this.finish();
            }
        }, 3000);

        if (!isTaskRoot()) {
            finish();
            return;
        }

    }
}