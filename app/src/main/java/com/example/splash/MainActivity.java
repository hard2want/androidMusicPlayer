package com.example.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create an instance of the timer class to finish the current task and start the next activity
        TimerTask task = new TimerTask() {
            @Override
            public void run(){
                finish();
                startActivity(new Intent(MainActivity.this, SalsaActivity.class));
            } // end run
        }; // end task = new TimerTask()

        // create an instance of the Timer class and store it in a variable
        Timer opening = new Timer();

        // access the schedule() method of the Timer object to set the delay in milliseconds
        opening.schedule(task, 2500);


    } // end onCreate()
} // end MainActivity
