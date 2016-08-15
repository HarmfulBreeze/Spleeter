package com.timer.spleeter;

import android.app.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.timer.spleeter.StopwatchController;


public class MainActivity extends AppCompatActivity 
{
    private Toolbar mToolbar;
    public Stopwatch stopwatch;
    public StopwatchController stopwatchController;
    protected boolean isRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        stopwatchController = new StopwatchController(this);
    }

    public void onStartButtonClick(View view) {
        stopwatchController.start();
        if(stopwatchController.isRunning())
            ((TextView) view).setText("Pause");
        else
            ((TextView) view).setText("Start");
    }

    public void onResetButtonClick(View view) {
        stopwatchController.reset();
        ((TextView) findViewById(R.id.button)).setText("Start");
    }
}
