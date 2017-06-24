package com.example.manu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /* Texto para el correo electrónico. */
    private EditText correo;
    /* Texto para la contraseña. */
    private EditText contrasenia;
    /* Botón para iniciar la aplicación. */
    private Button login;

    /**
     * Método que crea la vista. Cuando se crea la vista se hace esto. :D
     * (Es como el constructor).
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Inicializamos los atributos. */
        correo = (EditText)findViewById(R.id.correo);
        contrasenia = (EditText)findViewById(R.id.contrasenia);
        login = (Button)findViewById(R.id.login);

        /* Asignamos el escucha al botón. */
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                if (correo.getText().length() < 6 || contrasenia.getText().length() != 6)
                    Toast.makeText(this, "Longitud inválida", Toast.LENGTH_SHORT).show();
                else {
                    Intent intent = new Intent(this, ListaActivity.class);
                    startActivity(intent);
                }
                break;
        }
    }
}
