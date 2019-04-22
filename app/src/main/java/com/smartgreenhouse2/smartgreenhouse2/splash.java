package com.smartgreenhouse2.smartgreenhouse2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class splash extends Activity {
    MediaPlayer music ;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        music = MediaPlayer.create(getApplicationContext(), R.raw.m);
        if(music != null)
            music.start();

        new Handler().postDelayed(new Runnable() { @Override public void run()
        { final Intent mainIntent = new Intent(getApplicationContext(), login.class);
        splash.this.startActivity(mainIntent);
        splash.this.finish(); } },
                4000);
    }
}
