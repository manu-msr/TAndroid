package com.example.manu.myapplication;

/**
 * Created by manu on 13/06/17.
 */

public class Pokemon {
    private String nombre;
    private String tipo;
    private String url_imagen;

    public Pokemon() {
    }

    public Pokemon(String nombre, String tipo, String url_imagen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.url_imagen = url_imagen;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", url_imagen='" + url_imagen + '\'' +
                '}';
    }
}
