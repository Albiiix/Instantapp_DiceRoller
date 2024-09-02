package com.example.instantapp_diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button boton_tirar;
    private TextView resultado;
    private ImageView dado;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton_tirar =  findViewById(R.id.boton_tirar);
        resultado = findViewById(R.id.resultado);
        dado = findViewById(R.id.dado);

        boton_tirar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tirarDado();
            }
        });
    }

    private void tirarDado(){

        int numero = random.nextInt(7-1)+ 1;
        resultado.setText(String.valueOf(numero));
        switch (numero){
            case 1:
                dado.setImageResource(R.drawable.uno);
                break;
            case 2:
                dado.setImageResource(R.drawable.dos);
                break;
            case 3:
                dado.setImageResource(R.drawable.tres);
                break;
            case 4:
                dado.setImageResource(R.drawable.cuatro);
                break;
            case 5:
                dado.setImageResource(R.drawable.cinco);
                break;
            case 6:
                dado.setImageResource(R.drawable.seis);
                break;
            default:
                dado.setImageResource(R.drawable.vacio);
                break;
        }

        Toast.makeText(this, "Dado tirado", Toast.LENGTH_SHORT).show();
    }
}