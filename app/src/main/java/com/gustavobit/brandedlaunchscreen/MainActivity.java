package com.gustavobit.brandedlaunchscreen;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    /*Tempo apenas para exemplo*/
    private static final int SLEEP_TIME = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**Thread criada apenas para exemplificar. Caso queira baixar dados deverá utilizar outros meios,
         *  como por exemplo, uso de AsyncTask.
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(SLEEP_TIME);
                    startActivity(new Intent(MainActivity.this, InitialActivity.class));
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).run();
    }

}
