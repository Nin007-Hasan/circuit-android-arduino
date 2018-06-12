package com.nsu.cse299.project;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class StartupActivity extends AppCompatActivity

{
    public final  int THREAD_RUNNING_TIME=5000;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);

        checkInternet();

        //Thread Handler for 5 sec.
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(StartupActivity.this, MainActivity.class);
                StartupActivity.this.startActivity(mainIntent);
                StartupActivity.this.finish();
            }
        }, THREAD_RUNNING_TIME);
    }

    private void checkInternet()
    {

    }
}
