package com.example.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText name = findViewById(R.id.editTextNome);
        EditText senhaNEW = findViewById(R.id.editTextSenhaNEW);
        EditText usuario_name = findViewById(R.id.editTextUsuario_NomeNEW);
        Button cadastrar = findViewById(R.id.bnt_Cadastrar);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeCompleto = name.getText().toString();
                String usuario = usuario_name.getText().toString();
                String senha = senhaNEW.getText().toString();

                SharedPreferences sharedPref = getSharedPreferences("dados_login", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("nome", nomeCompleto);
                editor.putString("usuario", usuario);
                editor.putString("senha", senha);
                editor.apply();

                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

