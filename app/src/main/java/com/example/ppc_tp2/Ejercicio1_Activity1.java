package com.example.ppc_tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ejercicio1_Activity1 extends AppCompatActivity {

    private TextView show_text_ej1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1_1);

        show_text_ej1 = (TextView) findViewById(R.id.show_text_ej1);

        String text = getIntent().getStringExtra("text");
        show_text_ej1.setText(text);
    }

    public void changeName (View view){
        Intent i = new Intent(this, Ejercicio1_Activity2.class);
        startActivity(i);
    }

    public void backHome (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}