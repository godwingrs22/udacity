package com.udacity.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button spotifyStreamerBtn;
    private Button superduoScoresBtn;
    private Button superduoLibraryBtn;
    private Button builditBiggerBtn;
    private Button xyzReaderBtn;
    private Button capstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spotifyStreamerBtn = (Button) findViewById(R.id.spotify_streamer);
        superduoScoresBtn = (Button) findViewById(R.id.superduo_scores);
        superduoLibraryBtn = (Button) findViewById(R.id.superduo_library);
        builditBiggerBtn = (Button) findViewById(R.id.build_it_bigger);
        xyzReaderBtn = (Button) findViewById(R.id.xyz_reader);
        capstoneBtn = (Button) findViewById(R.id.capstone);

        spotifyStreamerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("This Button will launch my Media Streamer App!");
            }
        });

        superduoScoresBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("This Button will launch my Football Scores App!");
            }
        });

        superduoLibraryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("This Button will launch my Library App!");
            }
        });

        builditBiggerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("This Button will launch my Gradle Project App!");
            }
        });

        xyzReaderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("This Button will launch my Reader App!");
            }
        });

        capstoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("This Button will launch my Capstone App!");
            }
        });
    }

    private void showToast(final String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
