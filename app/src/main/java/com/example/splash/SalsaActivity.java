package com.example.splash;

import android.app.Activity;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SalsaActivity extends Activity {

    ImageButton b1, b2, b3;
    MediaPlayer mpMark, mpFrankie, mpCelia;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salsa);

        b1 = (ImageButton) findViewById(R.id.imageButton1); // Mark
        b2 = (ImageButton) findViewById(R.id.imageButton2); // Frankie
        b3 = (ImageButton) findViewById(R.id.imageButton3); // Celia

        mpMark = new MediaPlayer();
        mpMark = MediaPlayer.create(this, R.raw.valiolapena);

        mpFrankie = new MediaPlayer();
        mpFrankie = MediaPlayer.create(this, R.raw.lodudo);

        mpCelia = new MediaPlayer();
        mpCelia = MediaPlayer.create(this, R.raw.quimbara);

        playing = 0;

    } // end onCreate()

    public void mark(View v){
        switch (playing) {
            case 0:
                mpMark.start();
                playing = 1;
                b1.setImageResource(R.drawable.pause);
                b2.setEnabled(false);
                b3.setEnabled(false);
                break;
            case 1:
                mpMark.pause();
                playing = 0;
                b1.setImageResource(R.drawable.play);
                b2.setEnabled(true);
                b3.setEnabled(true);
                break;
        } // end switch
    } // end mark()

    public void frankie(View v){
        switch (playing) {
            case 0:
                mpFrankie.start();
                playing = 1;
                b2.setImageResource(R.drawable.pause);
                b1.setEnabled(false);
                b3.setEnabled(false);
                break;
            case 1:
                mpFrankie.pause();
                playing = 0;
                b2.setImageResource(R.drawable.play);
                b1.setEnabled(true);
                b3.setEnabled(true);
                break;
        } // end switch
    } // end frankie()

    public void celia(View v){
        switch (playing) {
            case 0:
                mpCelia.start();
                playing = 1;
                b3.setImageResource(R.drawable.pause);
                b1.setEnabled(false);
                b2.setEnabled(false);
                break;
            case 1:
                mpCelia.pause();
                playing = 0;
                b3.setImageResource(R.drawable.play);
                b1.setEnabled(true);
                b2.setEnabled(true);
                break;
        } // end switch
    } // end celia()

} // end SalsaActivity {}
