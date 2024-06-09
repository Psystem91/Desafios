import com.aluracueros.screenmatch.modelos.Episodio;
import com.aluracueros.screenmatch.modelos.Pelicula;
import com.aluracueros.screenmatch.modelos.Serie;
import com.aluracursos.screenmach.calculos.CalculaDeTiempo;
import com.aluracursos.screenmach.calculos.FiltroReco;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {


        Pelicula menuPeli = new Pelicula();
        Pelicula peliDos = new Pelicula();
        Serie menuSerie = new Serie();
        Serie seriDos = new Serie();
        CalculaDeTiempo calculadora = new CalculaDeTiempo();
        FiltroReco filtroReco = new FiltroReco();
        Episodio episodio = new Episodio();

        // metodo para hacer el new en la memoria

        var peliculaSam = new Pelicula();

        peliculaSam.setNombre("Codigo del Miedo");
        peliculaSam.setFechaDeLazamineto(2005);
        peliculaSam.setDuracionEnMinutos(130);


        menuPeli.setNombre("Doble Cara");
        menuPeli.setDuracionEnMinutos(140);
        menuPeli.setFechaDeLazamineto(1997);
        menuPeli.setIncluidoEnPlan(true);

        peliDos.setNombre("Destino Final");
        peliDos.setDuracionEnMinutos(120);
        peliDos.setFechaDeLazamineto(2004);

        //evaluaciones
        menuPeli.evalua(7.8);
        menuPeli.evalua(10);
        menuPeli.evalua(8.7);

        menuSerie.setNombre("Los 100");
        menuSerie.setFechaDeLazamineto(2018);
        menuSerie.setTemporadas(4);
        menuSerie.setMinutosPorEpisodio(45);
        menuSerie.setEpisodiosPorTemporada(5);
        menuSerie.setDuracionEnMinutos(menuSerie.getDuracionEnMinutos());

        episodio.setNombre("El inicio");
        episodio.setNumero(1);
        episodio.setSerie(menuSerie);
        episodio.setTotalVisual(5);


        seriDos.setNombre("The Fly");
        seriDos.setFechaDeLazamineto(2024);
        seriDos.setTemporadas(2);
        seriDos.setMinutosPorEpisodio(40);
        seriDos.setEpisodiosPorTemporada(3);
        seriDos.setDuracionEnMinutos(seriDos.getDuracionEnMinutos());

        calculadora.incluye(menuPeli);
        calculadora.incluye(menuSerie);
        calculadora.incluye(seriDos);
        calculadora.incluye(peliDos);

        //lista de peliculas

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(menuPeli);
        listaDePeliculas.add(peliDos);
        listaDePeliculas.add(peliculaSam);




        //impresiones pantalla

        menuSerie.muestraFichaTecnica();
        menuPeli.muestraFichaTecnica();
        seriDos.muestraFichaTecnica();
        peliDos.muestraFichaTecnica();
        System.out.println(calculadora.getTiempoTotal());
        filtroReco.filtro(menuPeli);
        filtroReco.filtro(episodio);

        //impresion de lista de peliculas

        System.out.println("Tamaño de la lista es: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());
        System.out.println("La segunda pelicula es: " + listaDePeliculas.get(1).getNombre());
        System.out.println("La tercera pelicula es: " + listaDePeliculas.get(2).getNombre());

        System.out.println("\n" + listaDePeliculas);
        System.out.println("toString de la pelicula: es " + listaDePeliculas.get(0).toString());










//        System.out.println(String.format("%.2f",menuPeli.calculaMedia()));
//        System.out.println(menuPeli.getTotalMedia());
//        System.out.println("Nombre de la pelicula " + menuPeli.getNombre());
//        System.out.println("Su lanzamiento: " + menuPeli.getFechaDeLazamineto());



    }
}
