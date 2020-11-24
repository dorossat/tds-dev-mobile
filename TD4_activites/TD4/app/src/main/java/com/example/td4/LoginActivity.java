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
    private EditText login;
    private TextView message;

    private SettingsActivity settings;
    Button btn;

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
        login = findViewById(R.id.login);
        btn = findViewById(R.id.loginBtn);

        btn.setOnClickListener(v -> {
            String login = String.valueOf(username.getText());
            String pswd = String.valueOf(password.getText());

            if ((login.equals(settings.getUsername())) && (pswd.equals(settings.getPassword()))) {
                Intent intent  = new Intent(LoginActivity.this, NewsActivity.class);
                intent.putExtra("login", String.valueOf(this.login.getText()));
                settings.setLogin(String.valueOf(this.login.getText()));
                startActivity(intent);
                finish();
            } else {
                message.setText("Username ou mot de passe incorrect !");
            }

        });
    }
}