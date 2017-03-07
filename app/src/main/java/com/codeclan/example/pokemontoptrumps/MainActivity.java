package com.codeclan.example.pokemontoptrumps;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button playBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playBtn = (Button) findViewById(R.id.playBtn);


    }

    public void OnPlayBtnClicked(View view) {

        startActivity(new Intent(MainActivity.this, PlayActivity.class));
    }
}