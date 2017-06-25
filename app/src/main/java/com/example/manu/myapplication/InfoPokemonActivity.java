package com.example.manu.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class InfoPokemonActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView nombre;
    private TextView info;
    private ImageView foto;
    private Button boton;
    private Bundle bundle;
    private Pokemon enviado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_pokemon);

        nombre = (TextView)findViewById(R.id.nombrePokemon);
        info = (TextView)findViewById(R.id.InfoPokemon);
        foto = (ImageView)findViewById(R.id.FotoPokemon);
        boton = (Button)findViewById(R.id.VideoPokemon);

        bundle = getIntent().getExtras();
        enviado = (Pokemon)bundle.get("pokemon");
        nombre.setText(enviado.getNombre());
        Glide.with(this).load(enviado.getUrl_imagen()).into(foto);
        info.setText(enviado.getInformacion());

        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.VideoPokemon:
                Intent intet = new Intent(Intent.ACTION_VIEW, Uri.parse(enviado.getUrl_video()));
                startActivity(intet);
        }
    }
}
