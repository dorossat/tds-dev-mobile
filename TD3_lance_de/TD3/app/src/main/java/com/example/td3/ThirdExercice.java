package com.example.td3;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdExercice extends AppCompatActivity {
    TextView result1;
    TextView result2;
    EditText number;
    Button btn_lancer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex03);

        result1 = findViewById(R.id.result1);
        result2 = findViewById(R.id.result2);

        number = findViewById(R.id.nombre);
        btn_lancer = findViewById(R.id.btn);

        btn_lancer.setOnClickListener(v -> {
            // Toast.makeText(ThirdExercice.this, "Dé lancé !", Toast.LENGTH_LONG).show();
            int value1;
            int value2;
            if (this.number.getText().toString().equals("")) {
                 value1 =  (int) (Math.random() * 0) + 1;
                 value2 =  (int) (Math.random() * 1) + 1;
            } else {
                 value1 =  (int) (Math.random() * Integer.parseInt(this.number.getText().toString())) + 1;
                 value2 =  (int) (Math.random() * Integer.parseInt(this.number.getText().toString())) + 2;
            }
            this.result1.setText(String.valueOf(value1));
            this.result2.setText(String.valueOf(value2));
        });
    }
}
