package com.example.manu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /* Botón de la vista.*/
    private Button btn_cambiar;
    /* Botón para cambiar de actividad. */
    private  Button ir_lista;
    /* Texto de la vista. */
    private TextView tv_cambiar;
    private EditText plain_text;

    /**
     * Método que crea la vista. Cuando se crea la vista se hace esto. :D
     * (Es como el constructor).
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Inicializamos los atributos. */
        btn_cambiar = (Button)findViewById(R.id.btn_cambiar);
        ir_lista = (Button)findViewById(R.id.ir_lista);
        tv_cambiar = (TextView)findViewById(R.id.tv_palabra);
        plain_text = (EditText)findViewById(R.id.editText);

        btn_cambiar.setOnClickListener(this);
        ir_lista.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_cambiar:
                String nombre = plain_text.getText().toString();
                if (TextUtils.isEmpty(nombre))
                    Toast.makeText(MainActivity.this, "Introduce un texto", Toast.LENGTH_SHORT).show();
                else
                    tv_cambiar.setText("Hola " + nombre);
                break;
            case R.id.ir_lista:
                Intent intent = new Intent(this, ListaActivity.class);
                startActivity(intent);
                break;
        }
    }
}
