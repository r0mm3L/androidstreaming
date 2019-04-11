package com.example.rommelalastra.streaming2;
//package alabs.tvapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button watch ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        watch = (Button) findViewById(R.id.button);

        watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onclick (View view) {
                Intent intent = new Intent (getApplicationContent(),PlayerActivity.class);
                startActivity(intent);
            }
        });
    }
}
