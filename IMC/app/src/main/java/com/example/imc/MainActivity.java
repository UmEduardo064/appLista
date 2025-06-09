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

        EditText editTextpeso = findViewById(R.id.editTextpeso);
        EditText editTextaltura = findViewById(R.id.editTextidade);
        Button btnCalculo = findViewById(R.id.btnCalculo);
        TextView tvResultado = findViewById(R.id.tvResultado);
        Button leaveButtom = findViewById(R.id.leaveButtom);

        // Clique do botão
        btnCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get input values and trim whitespace
                String inputaltura = editTextaltura.getText().toString().trim();
                String inputpeso = editTextpeso.getText().toString().trim();

                // Check if inputs are empty
                if (inputaltura.isEmpty() || inputpeso.isEmpty()) {
                    tvResultado.setText("Por favor, preencha peso e altura");
                    return;
                }

                try     {
                    // Parse to float (using comma as decimal separator common in Portuguese)
                    float altura = Float.parseFloat(inputaltura.replace(",", "."));
                    float peso = Float.parseFloat(inputpeso.replace(",", "."));

                    // Check for valid values
                    if (altura <= 0 || peso <= 0) {
                        tvResultado.setText("Valores devem ser maiores que zero");
                        return;
                    }

                    // Calculate IMC (weight in kg divided by height in meters squared)
                    float imc = peso / (altura * altura);

                    // Determine classification
                    String classificacao;
                    if (imc <= 18.5) {
                        classificacao = "Magreza";
                    } else if (imc <= 24.9) {
                        classificacao = "Normal";
                    } else if (imc <= 29.9) {
                        classificacao = "Sobrepeso";
                    } else if (imc <= 39.9) {
                        classificacao = "Obesidade";
                    } else {
                        classificacao = "Obesidade Grave";
                    }

                    // Display result with 2 decimal places
                    tvResultado.setText(String.format("IMC: %.2f - %s", imc, classificacao));

                } catch (NumberFormatException e) {
                    tvResultado.setText("Valores inválidos. Use números (ex: 1.75)");
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