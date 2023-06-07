package com.pkscoding.qrdemo;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button qrbtn;
    public static TextView qrtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //type casting
        qrbtn = (Button) findViewById(R.id.qrbtn);
        qrtext = (TextView) findViewById(R.id.qrtext);

        qrbtn.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(),
                        QRScanner.class)));
    }
}