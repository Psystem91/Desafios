public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Mis Pelis"); //imprime todo en pantalla
        System.out.println("Pelicula: Matrix");

        int fechaDeLapelicula = 1999; // deja el numero entero
        boolean incluidoEnPlan = true; // preguntas de falso o Cierto
        double notaDeLaPelicula = 8.2; // para numero decimales

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        //si solo se hace para una descripcion
        String sinopsis = """
                Matrix es una pelicula de muy buena 
                calidad creada en:  
                """ + fechaDeLapelicula + """
                 con numero de nota
                """ + notaDeLaPelicula;
        System.out.println(sinopsis);

        int clasificacion = (char) (media / 2);
        System.out.println(clasificacion);




    }
}