package com.example.td4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private TextView message;

    private SettingsActivity settings;
    Button btn;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        setTitle(getLocalClassName());

        // Le contexte de l'application
        settings = (SettingsActivity) getApplicationContext();

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        message = findViewById(R.id.message);
        btn = findViewById(R.id.loginBtn);

        btn.setOnClickListener(v -> {
            String login = String.valueOf(username.getText());
            String pswd = String.valueOf(password.getText());

            if ((login.equals(this.settings.getUsername())) && (pswd.equals(this.settings.getPassword()))) {
                Intent intent  = new Intent(LoginActivity.this, NewsActivity.class);
                startActivity(intent);
                finish();
            } else {
                message.setText("Username ou mot de passe incorrect !");
            }

        });
    }
}