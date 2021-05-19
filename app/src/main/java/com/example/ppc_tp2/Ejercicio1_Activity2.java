package com.example.ppc_tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ejercicio1_Activity2 extends AppCompatActivity {

    private EditText text_ej1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1_2);

        text_ej1 = (EditText) findViewById(R.id.text_ej1);
    }

    public void sendText (View view){
        Intent i = new Intent(this, Ejercicio1_Activity1.class);
        i.putExtra("text", text_ej1.getText().toString());
        startActivity(i);
    }

    public void notSendText (View view){
        Intent i = new Intent (this, Ejercicio1_Activity1.class);
        startActivity(i);
    }
}