package com.aluracueros.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{

    private String nombre;
    private int fechaDeLazamineto;
    private int duracionEnMinutos;
    private boolean incluidoEnPlan;
    private double sumaEvaluaciones;
    private int totalMedia;


    public void muestraFichaTecnica(){

        System.out.println("\n");
        System.out.println("La pelicula es " + nombre);
        System.out.println("Fue lanzada en: " + fechaDeLazamineto);
        System.out.println("Tiene una Duracion de: " + getDuracionEnMinutos());


    }



    public void evalua(double nota){

        sumaEvaluaciones += nota;
        totalMedia ++;

    }

    public double calculaMedia(){

        return sumaEvaluaciones / totalMedia;


    }

    //get -  para obtener datos

    public int getTotalMedia(){

        return totalMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public int getFechaDeLazamineto(){
        return fechaDeLazamineto;
    }

    //set - para colocar datos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setFechaDeLazamineto(int fechaDeLazamineto) {
        this.fechaDeLazamineto = fechaDeLazamineto;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public Titulo(String nombre, int fechaDeLazamineto) {
        this.nombre = nombre;
        this.fechaDeLazamineto = fechaDeLazamineto;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
