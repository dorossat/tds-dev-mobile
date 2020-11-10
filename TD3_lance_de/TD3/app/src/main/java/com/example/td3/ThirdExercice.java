package com.example.td3;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdExercice extends AppCompatActivity {
    TextView result;
    EditText nombre;
    Button btn_lancer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex03);

        result = findViewById(R.id.result);
        nombre = findViewById(R.id.nombre);
        btn_lancer = findViewById(R.id.btn);

        btn_lancer.setOnClickListener(v -> {
            Toast.makeText(ThirdExercice.this, "Dé lancé !", Toast.LENGTH_LONG).show();
            int nombre =  (int) (Math.random() * Integer.parseInt(this.nombre.toString())) + 1;
            this.result.setText(String.valueOf(nombre));
        });
    }
}
