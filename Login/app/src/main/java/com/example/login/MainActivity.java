package com.example.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usuario_name = findViewById(R.id.editTextUsuario_NomeMain);
        EditText senhaOLD = findViewById(R.id.editTextSenhaMain);
        TextView status = findViewById(R.id.textStatus);
        Button login = findViewById(R.id.bnt_Logar);
        Button cadastrar = findViewById(R.id.bnt_Criar_NovaConta);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuarioDigitado = usuario_name.getText().toString();
                String senhaDigitada = senhaOLD.getText().toString();

                SharedPreferences sharedPref = getSharedPreferences("dados_login", MODE_PRIVATE);
                String usuarioSalvo = sharedPref.getString("usuario", "");
                String senhaSalva = sharedPref.getString("senha", "");

                if(usuarioDigitado.equals(usuarioSalvo) && senhaDigitada.equals(senhaSalva)) {

                    Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(intent);
                    finish();
                } else {
                    status.setText("Usuário ou senha incorretos!");
                    Toast.makeText(MainActivity.this, "Dica: Cadastre na Tela 2 primeiro", Toast.LENGTH_LONG).show();
                }
            }
        });

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }
}