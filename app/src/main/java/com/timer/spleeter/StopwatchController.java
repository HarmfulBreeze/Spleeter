package com.timer.spleeter;

import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;

import com.timer.spleeter.Stopwatch;

public class StopwatchController {
    public Timer refresher;
    public Stopwatch stopwatch;
    protected boolean isRunning = false;
    TextView maintimer;
}
