package com.aluracursos.screenmach.calculos;

public class FiltroReco {

    public void filtro(Clasificacion clasificacion){

        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Buena eleccion");
        } else if (clasificacion.getClasificacion() == 2){
            System.out.println("La mas popular");
        } else {
            System.out.println("Gustas agregarla en tu lista");
        }


    }
}
