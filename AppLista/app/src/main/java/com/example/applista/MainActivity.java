package com.example.applista;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView ListViewLivros;


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

        ListViewLivros = findViewById(R.id.listViewLivros);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.activity_list_item_livro,
                R.id.textViewLivro,
                livros
        );

        ListViewLivros.setAdapter(adapter);

    }
}