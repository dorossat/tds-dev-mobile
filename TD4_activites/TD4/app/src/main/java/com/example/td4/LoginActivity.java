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
    Button btn;

    private String myUsername = "hhamza";
    private String myPassword = "Hamza9623";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        setTitle(getLocalClassName());

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        message = findViewById(R.id.message);
        btn = findViewById(R.id.loginBtn);

        btn.setOnClickListener(v -> {
            String login = String.valueOf(username.getText());
            String pswd = String.valueOf(password.getText());

            if ((login.equals(this.myUsername)) && (pswd.equals(this.myPassword))) {
                Intent intent  = new Intent(LoginActivity.this, NewsActivity.class);
                startActivity(intent);
            } else {
                message.setText("Username ou mot de passe incorrect !");
            }

        });
    }
}