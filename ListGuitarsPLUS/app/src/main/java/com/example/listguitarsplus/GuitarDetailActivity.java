package com.example.listguitarsplus;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class GuitarDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar_detail);

        String description = getIntent().getStringExtra("description");

        TextView descTextView = findViewById(R.id.descriptionTextView);
        descTextView.setText(description);
    }
}