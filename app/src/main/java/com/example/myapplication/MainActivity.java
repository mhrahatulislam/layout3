package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button cleanupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        cleanupButton = findViewById(R.id.cleanupButton);

        cleanupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Call the method to clean up the TextView
                cleanupTextView();
            }
        });
    }

    private void cleanupTextView() {
        // Your cleanup logic goes here
        // For example, setting an empty text
        textView.setText("");
    }
}