package com.example.td4;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    Button details;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        details = findViewById(R.id.details);
        details.setOnClickListener(new EventClick());
    }

    private class EventClick implements View.OnClickListener {

        @RequiresApi(api = Build.VERSION_CODES.Q)
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(DetailsActivity.this, NewsActivity.class);
            startActivity(intent);
        }
    }

}
