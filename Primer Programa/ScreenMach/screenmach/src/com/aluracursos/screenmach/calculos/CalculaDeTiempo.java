package com.aluracursos.screenmach.calculos;

import com.aluracueros.screenmatch.modelos.Pelicula;
import com.aluracueros.screenmatch.modelos.Serie;
import com.aluracueros.screenmatch.modelos.Titulo;

public class CalculaDeTiempo {
    private int tiempoTotal;

//    public void incluye(Pelicula pelicula){
//        tiempoTotal += pelicula.getDuracionEnMinutos();
//    }

//    public void incluye(Serie serie){
//        tiempoTotal += serie.getDuracionEnMinutos();
//    }
//
    public int getTiempoTotal() {
        return tiempoTotal;
    }

    //polimorfismo

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }


}




