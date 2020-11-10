package com.example.td2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(R.layout.password);
        //setContentView(R.layout.calendar);
        //setContentView(R.layout.relativelayoutexemple);
        //setContentView(R.layout.setconstraints);

        setContentView(R.layout.main);
        Button b1 = (Button) findViewById(R.id.ex01);
        b1.setOnClickListener(view -> {
            Intent intent = new Intent(context, RepasActivity.class);
            startActivity(intent);
        });

        Button b2 = (Button) findViewById(R.id.ex02);
        b2.setOnClickListener(view -> {
            Intent intent = new Intent(context, MeteoActivity.class);
            startActivity(intent);
        });
    }
}