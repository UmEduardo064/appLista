package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextIdade = findViewById(R.id.editTexidade);
        Button btnCalculo = findViewById(R.id.btnCalculo);
        TextView tvResultado = findViewById(R.id.tvResultado);
        Button leaveButtom = findViewById(R.id.leaveButtom);

        // Clique do botão
        btnCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputIdade = editTextIdade.getText().toString().trim();

                // Verifica se está vazio
                if (inputIdade.isEmpty()) {
                    tvResultado.setText("Coloque um valor!");B
                }
                // Verifica se é um número inteiro válido
                else if (inputIdade.matches("\\d+")) { // Aceita apenas dígitos (0-9)
                    int idadeHumana = Integer.parseInt(inputIdade);
                    int idadeCalc = idadeHumana * 7;
                    tvResultado.setText("Result: " + idadeCalc);
                }
                else {
                    tvResultado.setText("Digite apenas números!");
                }
            }
        });



        leaveButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}