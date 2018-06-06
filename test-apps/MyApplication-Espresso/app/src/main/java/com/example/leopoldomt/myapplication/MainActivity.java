package com.example.leopoldomt.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText lado1 = (EditText) findViewById(R.id.lado1);
        final EditText lado2 = (EditText) findViewById(R.id.lado2);
        final EditText lado3 = (EditText) findViewById(R.id.lado3);
        final Button botao = (Button) findViewById(R.id.botao);
        final TextView resultado = (TextView) findViewById(R.id.resultado);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l1 = lado1.getText().toString();
                String l2 = lado2.getText().toString();
                String l3 = lado3.getText().toString();
                if (l1.isEmpty() || l2.isEmpty() || l3.isEmpty()) {
                    //Toast.makeText(getApplicationContext(),"Preencha todos os campos", Toast.LENGTH_LONG).show();
                    resultado.setText("Preencha todos os campos!");
                }
                else {
                    if (l1.equals(l2) && l2.equals(l3)) {
                        resultado.setText("Tudo ok!");
                    }
                }
            }
        });

    }
}
