package com.aluracueros.screenmatch.modelos;

public class Serie extends Titulo{

    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLazamineto) {
        super(nombre, fechaDeLazamineto);
    }

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNombre() +  "(" + this.getFechaDeLazamineto() + ")";
    }
}

