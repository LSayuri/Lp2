package com.example.rafaela.fatorialdadepresso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
    }

    public void fatorial(View v){

        EditText txt1 = (EditText) findViewById(R.id.entrada);

        TextView saida = (TextView)findViewById(R.id.resultado);

        String s1 = txt1.getText().toString();
        int n = Integer.parseInt(s1);

        int aux = 1;

        for (int i = n; i>=1; i--){

            aux = aux * i;
        }

        saida.setText(" " + aux);
    }
}
