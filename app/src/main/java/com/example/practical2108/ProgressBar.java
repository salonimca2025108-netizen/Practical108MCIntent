package com.example.practical2108;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProgressBar extends AppCompatActivity {

    android.widget.ProgressBar progressBar;
    Button btnStart;
    TextView txtProgress;

    int progress = 0;

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Connect Java file with progress_bar.xml
        setContentView(R.layout.progress_bar);

        // Connect XML with Java
        progressBar = findViewById(R.id.progressBar);
        btnStart = findViewById(R.id.btnStart);
        txtProgress = findViewById(R.id.txtProgress);

        // Start button
        btnStart.setOnClickListener(v -> {

            progress = 0;

            progressBar.setProgress(0);
            txtProgress.setText("0%");

            handler.postDelayed(new Runnable() {

                @Override
                public void run() {

                    if (progress <= 100) {

                        progressBar.setProgress(progress);

                        txtProgress.setText(progress + "%");

                        if (progress == 100) {

                            txtProgress.setText("Process Completed");

                            return;
                        }

                        progress = progress + 10;

                        handler.postDelayed(this, 500);
                    }
                }

            }, 500);
        });
    }
}