package com.example.manu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {

    private ListView listisha;
    private ArrayList<Pokemon> pokemones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        listisha = (ListView)findViewById(R.id.listisha);

        Pokemon sqr = new Pokemon("Squirtle", "Agua", "https://s-media-cache-ak0.pinimg.com/736x/a7/76/60/a776601ff59d6e9a9a5663c327ed3624.jpg");
        Pokemon chm = new Pokemon("Charmander", "Fuego", "https://pbs.twimg.com/media/CV-h81TW4AAPB9_.jpg");
        Pokemon blb = new Pokemon("Bulbasaur", "Hierba", "https://www.google.com.mx/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwjb_JfoyrvUAhWF4SYKHS5EAxkQjRwIBw&url=http%3A%2F%2Fknowyourmeme.com%2Fphotos%2F1095359-vamo-a-calmarno&psig=AFQjCNEb0Wj9qnBXE1eu-B6I6f_I3O_GEA&ust=1497469514658313");
        Pokemon pkc = new Pokemon("Pikachu", "Electrico", "http://i.imgur.com/Cx9HIjb.jpg");

        pokemones = new ArrayList<>();
        pokemones.add(sqr);
        pokemones.add(chm);
        pokemones.add(blb);
        pokemones.add(pkc);

        listisha.setAdapter(new AdapterLista(this, pokemones));
    }
}
