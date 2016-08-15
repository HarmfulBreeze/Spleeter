package com.timer.spleeter;

import android.app.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.timer.spleeter.Stopwatch;


public class MainActivity extends AppCompatActivity 
{
    private Toolbar mToolbar;
    public Stopwatch stopwatch;
    protected boolean isRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
    }

    public void onStartButtonClick(View view) {
        isRunning = true;
    }
}
