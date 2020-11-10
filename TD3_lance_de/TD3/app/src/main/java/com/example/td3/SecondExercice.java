package com.example.td3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondExercice extends AppCompatActivity {
    TextView result_1;
    TextView result_2;
    Button btn_lancer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex02);

        result_1 = findViewById(R.id.result1);
        result_2 = findViewById(R.id.result2);
        btn_lancer = findViewById(R.id.btn);

        btn_lancer.setOnClickListener(v -> {
            Toast.makeText(SecondExercice.this, "Dé lancé !", Toast.LENGTH_LONG).show();
            int result1 = (int) (Math.random() * 6) + 1;
            int result2 = (int) (Math.random() * 9) + 1;
            this.result_1.setText(String.valueOf(result1));
            this.result_2.setText(String.valueOf(result2));
        });
    }
}
