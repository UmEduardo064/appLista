package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listviewGuitars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] guitars = {

                "Explorer",
                "Flying V",
                "Flying ",
                "FireBird",
                "J-master",
                "Jaguar",
                "Jaguar",
                "JEM",
                "LesPaul",
                "Mockingbird",
                "Semi-Acoustic",
                "Soloist",
                "Star",
                "SG",
                "Stratocaster",
                "Telecaster",
                "Thinline",
                "Warlock",
                "ABBA",
                "Iceman",

        };

        listviewGuitars = findViewById(R.id.listviewGuitars);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.activity_list_guitars,
                R.id.textViewGuitars,
                guitars);

        listviewGuitars.setAdapter(adapter);
    }
}



package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivitySplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash);

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent(MainActivitySplash.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 5000);
    }
}



package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class activity_list_guitars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_guitars);
    }
}
