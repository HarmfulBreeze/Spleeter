package com.timer.spleeter;

import android.app.Activity;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;

public class StopwatchController {
    public Timer refresher;
    public Stopwatch stopwatch;
    private boolean isRunning = false;
    protected MainActivity activity;
    TextView maintimer;

    public StopwatchController(Activity activity){
        this.activity = (MainActivity) activity;
        maintimer = (TextView) activity.findViewById(R.id.textView);
        stopwatch = new Stopwatch();

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                maintimer.setText(Util.formatTimerString(0));
            }
        });
    }
    public void start(){
        if(!isRunning){
            refresher = new Timer();
            refresher.scheduleAtFixedRate(new Ticker(), 100, 100);
            stopwatch.start();
            isRunning = true;
        }
        else{
            refresher.cancel();
            stopwatch.stop();
            isRunning = false;
        }
    }

    public void reset(){
        stopwatch.reset();
        refresher.cancel();
        isRunning = false;
        ((TextView) activity.findViewById(R.id.textView)).setText("00:00:00.0");
    }

    public boolean isRunning(){
        return isRunning;
    }

    class Ticker extends TimerTask {
        @Override
        public void run() {
            activity.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    maintimer.setText(Util.formatTimerString(stopwatch.getTimeInTenths()));
                }
            });
        }
    }
}
