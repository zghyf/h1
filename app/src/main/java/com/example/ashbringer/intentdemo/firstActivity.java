package com.example.ashbringer.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class firstActivity extends AppCompatActivity {
    private TextView mytv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Intent intent = getIntent();
        String value = intent.getStringExtra("test");
        mytv = (TextView) findViewById(R.id.tv1);
        mytv.setText(value);

    }
}
