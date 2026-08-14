package com.example.practical2108;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Connect Java with XML
        setContentView(R.layout.activity_main);

        // Connect Button
        btnWebsite = findViewById(R.id.btnWebsite);

        // Button Click
        btnWebsite.setOnClickListener(view -> {

            // Create Implicit Intent
            Intent intent = new Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.google.com")
            );

            // Open browser
            startActivity(intent);
        });
    }
}