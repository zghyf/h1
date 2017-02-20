package com.example.ashbringer.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class secondActivity extends AppCompatActivity {
    private Button firstbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        firstbutton =(Button) findViewById(R.id.button1);
        firstbutton.setOnClickListener(new MyButtonListener());

    }
    class MyButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("test", "123");
            intent.setClass(secondActivity.this, firstActivity.class);
            secondActivity.this.startActivity(intent);
        }

    }
}
