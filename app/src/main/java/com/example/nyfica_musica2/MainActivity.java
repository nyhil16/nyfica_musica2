package com.example.nyfica_musica2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3;
    MediaPlayer mp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnPlay);
        btn2 = findViewById(R.id.btnPause);
        btn3 = findViewById(R.id.btnContinue);

    }

    public void play(View view) {
        int song = this.getResources().getIdentifier("fade_one_reason", "raw", getPackageName());
        mp1 = MediaPlayer.create(this, song);
        mp1.seekTo(0);
        mp1.start();
    }

    public void pause(View view) {
        if (mp1.isPlaying()) {
            mp1.pause();
        }
    }

    public void cont(View view) {
        if (!mp1.isPlaying()) {
            mp1.start();
        }
    }
}