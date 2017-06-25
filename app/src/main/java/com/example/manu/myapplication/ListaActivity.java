package com.example.manu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

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
        sqr.setInformación(R.string.squirtle);
        Pokemon chm = new Pokemon("Charmander", "Fuego", "https://pbs.twimg.com/media/CV-h81TW4AAPB9_.jpg");
        chm.setUrl_video("https://www.youtube.com/watch?v=RwF01l-mijk");
        chm.setInformación(R.string.charmander);
        Pokemon blb = new Pokemon("Bulbasaur", "Hierba", "http://i2.kym-cdn.com/photos/images/original/001/095/359/34c.jpg");
        blb.setUrl_video("https://www.youtube.com/watch?v=1iyFT6tieX4");
        blb.setInformación(R.string.bulbasaur);
        Pokemon pkc = new Pokemon("Pikachu", "Electrico", "http://i.imgur.com/Cx9HIjb.jpg");
        pkc.setUrl_video("https://www.youtube.com/watch?v=EZcLB9yBzfg");
        pkc.setInformación(R.string.pikachu);

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
                Intent intent = new Intent(ListaActivity.this, InfoPokemonActivity.class);
                intent.putExtra("pokemon", seleccionado);
                startActivity(intent);
            }
        });
    }
}
