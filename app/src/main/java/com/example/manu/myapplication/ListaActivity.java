package com.example.manu.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {

    private ListView listisha;
    private ArrayList<Pokemon> pokemones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        //Bundle bundle = getIntent().getExtras();
        //Toast.makeText(this, (String)bundle.get("texto"), Toast.LENGTH_SHORT).show();

        listisha = (ListView)findViewById(R.id.listisha);

        Pokemon sqr = new Pokemon("Squirtle", "Agua", "https://s-media-cache-ak0.pinimg.com/736x/a7/76/60/a776601ff59d6e9a9a5663c327ed3624.jpg");
        sqr.setUrl_video("https://youtu.be/YOtBpURJF7E");
        Pokemon chm = new Pokemon("Charmander", "Fuego", "https://pbs.twimg.com/media/CV-h81TW4AAPB9_.jpg");
        chm.setUrl_video("#");
        Pokemon blb = new Pokemon("Bulbasaur", "Hierba", "http://i2.kym-cdn.com/photos/images/original/001/095/359/34c.jpg");
        blb.setUrl_video("#");
        Pokemon pkc = new Pokemon("Pikachu", "Electrico", "http://i.imgur.com/Cx9HIjb.jpg");
        pkc.setUrl_video("#");

        pokemones = new ArrayList<>();
        pokemones.add(sqr);
        pokemones.add(chm);
        pokemones.add(blb);
        pokemones.add(pkc);

        listisha.setAdapter(new AdapterLista(this, pokemones));

        listisha.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Pokemon seleccionado = pokemones.get(i);
                //Toast.makeText(ListaActivity.this, seleccionado.getNombre(), Toast.LENGTH_SHORT).show();
                //Snackbar.make(view,seleccionado.getNombre(),Snackbar.LENGTH_SHORT).show();
                //Snackbar snackbar = Snackbar.make(view, seleccionado.getNombre(), Snackbar.LENGTH_SHORT);
                //snackbar.getView().setBackgroundColor(getResources().getColor(R.color.primary_text));
                //snackbar.show();
                //Intent intet = new Intent(Intent.ACTION_VIEW, Uri.parse(seleccionado.getUrl_video()));
                //startActivity(intet);
                Intent intent = new Intent(ListaActivity.this, InfoPokemon.class);
                intent.putExtra("nombre", seleccionado.getNombre());
                intent.putExtra("foto", seleccionado.getUrl_imagen());
                intent.putExtra("video", seleccionado.getUrl_video());
                startActivity(intent);
            }
        });
    }
}
