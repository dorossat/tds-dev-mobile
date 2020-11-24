package com.example.td4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {
    Button details;
    Button logout;
    Button about;
    TextView login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);
        setTitle(getLocalClassName());

        Intent intent_login = getIntent();

        details = findViewById(R.id.details);
        logout = findViewById(R.id.logout);
        about = findViewById(R.id.about);
        login = findViewById(R.id.login);

        if (intent_login.hasExtra("login")) {
            login.setText("Hello" + intent_login.getStringExtra("login"));
        } else {
            login.setText("Hello!");
        }

        details.setOnClickListener(v -> {
            Intent intent = new Intent(this, DetailsActivity.class);
            startActivity(intent);
        });

        logout.setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });

        about.setOnClickListener(v -> {
            String url = "https://news.google.com/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });
    }

    public void onBackPressed() {
        finish();
    }
}
