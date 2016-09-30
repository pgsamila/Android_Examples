package com.example.root.faultreportergs;


/**
 * Created by Amila Sampath Pelaketi Gamage
 */

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        File file = new File("/sdcard/data.csv");
        if (file.exists()) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    final Intent mainIntent1 = new Intent(Splash.this, MainActivity.class);
                    Splash.this.startActivity(mainIntent1);
                    Splash.this.finish();
                }
            }, 2000);
        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    final Intent mainIntent1 = new Intent(Splash.this, OtherActivity.class);
                    Splash.this.startActivity(mainIntent1);
                    Splash.this.finish();
                }
            }, 2000);
        }

    }
}
