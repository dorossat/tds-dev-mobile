package com.example.td6.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.td6.R;
import com.example.td6.interfaces.GithubService;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        text = findViewById(R.id.search);

        btn.setOnClickListener(v -> {
            String q = String.valueOf(text.getText());
            Intent intent = new Intent(MainActivity.this, ReposActivity.class);
            intent.putExtra("repos", q);
            startActivity(intent);
        });

    }

}
