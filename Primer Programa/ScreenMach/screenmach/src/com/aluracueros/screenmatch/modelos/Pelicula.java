package com.aluracueros.screenmatch.modelos;

import com.aluracursos.screenmach.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    private String director;

    public Pelicula(String nombre, int fechaDeLazamineto) {
        super(nombre, fechaDeLazamineto);
    }

    public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }


    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }


    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + "(" + getFechaDeLazamineto() + ")";

    }

//    public Pelicula(String nombre){
//            this.setNombre(nombre);
//    }
}





