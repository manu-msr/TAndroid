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

public class InfoPokemon extends AppCompatActivity implements View.OnClickListener {

    private TextView nombre;
    private TextView info;
    private ImageView foto;
    private Button boton;
    private Bundle bundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_pokemon);

        nombre = (TextView)findViewById(R.id.nombrePokemon);
        info = (TextView)findViewById(R.id.InfoPokemon);
        foto = (ImageView)findViewById(R.id.FotoPokemon);
        boton = (Button)findViewById(R.id.VideoPokemon);

        bundle = getIntent().getExtras();
        nombre.setText((String)bundle.get("nombre"));
        Glide.with(this).load(bundle.get("foto")).into(foto);

        boton.setOnClickListener(this);

        switch ((String)bundle.get("nombre")) {
            case "Squirtle":
                info.setText(R.string.squirtle);
                break;
            case "Charmander":
                info.setText(R.string.charmander);
                break;
            case "Bulbasaur":
                info.setText(R.string.bulbasaur);
                break;
            case "Pikachu":
                info.setText(R.string.pikachu);
                break;
        }


        //Bundle bundle = getIntent().getExtras();
        //Toast.makeText(this, (String)bundle.get("texto"), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.VideoPokemon:
                Intent intet = new Intent(Intent.ACTION_VIEW, Uri.parse((String)bundle.get("video")));
                startActivity(intet);
        }
    }
}
