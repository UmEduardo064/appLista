package com.example.applista;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    listView listViewLivros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        String[] livros = {
                "Dom Casmurro - Machado de Assis",
                "O Cortiço - Aluísio Azevedo",
                "Memórias Póstumas de Brás Cubas - Machado de Assis",
                "Capitães da Areia - Jorge Amado",
                "Grande Sertão: Veredas - Guimarães Rosa",
                "Dom Casmurro - Machado de Assis",
                "O Cortiço - Aluísio Azevedo",
                "Memórias Póstumas de Brás Cubas - Machado de Assis",
                "Capitães da Areia - Jorge Amado",
                "Grande Sertão: Veredas - Guimarães Rosa",
        };

        listViewLivros = findViewById(R.id.listViewLivros);

    }
}