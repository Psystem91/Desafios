package com.aluracursos.screenmatch.Principal;

import com.aluracueros.screenmatch.modelos.Pelicula;
import com.aluracueros.screenmatch.modelos.Serie;
import com.aluracueros.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class PricipalConListas {

    public static void main(String[] args) {

        Pelicula menuPeli = new Pelicula("Doble Cara", 1997);
        menuPeli.evalua(9);
        Pelicula peliDos = new Pelicula("Destino Final", 2004);
        peliDos.evalua(5);
        var peliculaSam = new Pelicula("Codigo del Miedo", 2005);
        peliculaSam.evalua(4);

        Serie menuSerie = new Serie("Los 100", 2018);
        Serie seriDos = new Serie("The Fly", 2024);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(menuPeli);
        lista.add(peliDos);
        lista.add(peliculaSam);
        lista.add(menuPeli);
        lista.add(seriDos);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
//                Pelicula pelicula = (Pelicula) item;
                System.out.println(pelicula.getClasificacion());
            }

        }

        ArrayList <String> listaDeArtistas =new ArrayList<>();
        listaDeArtistas.add("Thalia");
        listaDeArtistas.add("Pedro Infante");
        listaDeArtistas.add("Valentin Elizalde");
        listaDeArtistas.add("Cardenales de Nuevo Leon");
        System.out.println("\nLista de artistas no ordenada: " + listaDeArtistas);

        //sort es para ordenar la lista
        Collections.sort(listaDeArtistas);
        System.out.println("\nlista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("LIsta Ordenada: " + lista);



    }

}
