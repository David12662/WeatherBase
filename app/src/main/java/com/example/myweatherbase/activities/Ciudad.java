package com.example.myweatherbase.activities;

import com.example.myweatherbase.R;

public enum Ciudad  {

    Valencia("Valencia", R.mipmap.valencia),Barcelona("Barcelona",R.mipmap.barcelona),Madrid("Madrid",R.mipmap.madrid);

    private String nombre;

    private int foto;


    Ciudad(String nombre,int foto){
        this.nombre=nombre;
    }

    public int getFoto() {
        return foto;
    }

    @Override
    public String toString(){
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
