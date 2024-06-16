package com.aluracueros.screenmatch.modelos;

import com.aluracursos.screenmach.calculos.Clasificacion;

public class Episodio implements Clasificacion {

    private int numero;
    private String nombre;
    private Serie serie;
    private int totalVisual;

    public int getTotalVisual() {
        return totalVisual;
    }

    public void setTotalVisual(int totalVisual) {
        this.totalVisual = totalVisual;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {

        if (totalVisual > 100){
            return 4;
        } else if (totalVisual <=20){
            return 2;
        }else {
            return 1;
        }

//        if (totalVisual > 100){
//            return 4;
//        }else {
//            return 2;
//        }
    }
}
