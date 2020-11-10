package com.example.td3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstExercice extends AppCompatActivity  {
    TextView result;
    Button btn_lancer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex01);

        result = findViewById(R.id.result);
        btn_lancer = findViewById(R.id.exo_one_btn);

        btn_lancer.setOnClickListener(v -> {
            Toast.makeText(FirstExercice.this, "Dé lancé !", Toast.LENGTH_LONG).show();
            int result = (int) (Math.random() * 6) + 1;
            this.result.setText(String.valueOf(result));
        });
    }

}
