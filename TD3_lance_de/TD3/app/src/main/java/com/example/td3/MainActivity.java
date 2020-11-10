package com.example.td3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.ex01);
        btn2 = findViewById(R.id.ex02);
        btn3 = findViewById(R.id.ex03);

        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(this, FirstExercice.class);
            startActivity(intent);
        });

        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondExercice.class);
            startActivity(intent);
        });

        btn3.setOnClickListener(v -> {
            Intent intent = new Intent(this, ThirdExercice.class);
            startActivity(intent);
        });

    }
}