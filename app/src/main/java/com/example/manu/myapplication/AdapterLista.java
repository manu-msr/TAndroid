package com.example.manu.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by manu on 13/06/17.
 */
public class AdapterLista extends BaseAdapter {

    private Context context;
    private ArrayList<Pokemon> pokemons;

    public AdapterLista(Context context, ArrayList<Pokemon> pokemons) {
        this.context = context;
        this.pokemons = pokemons;
    }

    @Override
    public int getCount() {
        return pokemons.size();
    }

    @Override
    public Object getItem(int i) {
        return pokemons.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Pokemon seleccionado = pokemons.get(i);

        LayoutInflater inflater = LayoutInflater.from(context);
        View view2 = inflater.inflate(R.layout.adapter_pokemon, null);

        ImageView foto = (ImageView)view2.findViewById(R.id.iv_foto);
        TextView nombre = (TextView)view2.findViewById(R.id.tv_nombre);
        TextView tipo = (TextView)view2.findViewById(R.id.tv_tipo);

        nombre.setText(seleccionado.getNombre());
        tipo.setText(seleccionado.getTipo());

        return view2;
    }
}