package com.example.ppc_tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {

    //Attributes for calculator app

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        et1 = (EditText) findViewById(R.id.text_num1);
        et2 = (EditText) findViewById(R.id.text_num2);
        tv1 = (TextView) findViewById(R.id.text_resultado);
    }

    public void goMain(View view){
        Intent main_act = new Intent(this, MainActivity.class);
        startActivity(main_act);
    }

    //Calculator Methods

    public void Sumar(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        String result = String.valueOf(suma);
        tv1.setText(result);
    }

    public void Restar(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int resta = num1 - num2;

        String result = String.valueOf(resta);
        tv1.setText(result);
    }

    public void Multiplicar(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int multiplicar = num1 * num2;

        String result = String.valueOf(multiplicar);
        tv1.setText(result);
    }

    public void Dividir(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double num1 = Integer.parseInt(valor1);
        double num2 = Integer.parseInt(valor2);

        if (num2 == 0){
            Toast.makeText(this,"Prohibida División por Cero",Toast.LENGTH_SHORT).show();
        }else{
            double division = num1 / num2;
            String result = String.valueOf(division);
            tv1.setText(result);}
    }


}