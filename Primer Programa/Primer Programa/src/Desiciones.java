public class Desiciones {

    public static void main(String[] args) {
        //Variables
        int fechaDeLapelicula = 1999; // deja el numero entero
        boolean incluidoEnPlan = true; // preguntas de falso o Cierto
        double notaDeLaPelicula = 8.2; // para numero decimales
        String movi = "Contra Cara";
        String plan = "Plus";
        int dia = 3;

        if (fechaDeLapelicula >= 2022) {
            System.out.println("Peliculas Actuales");
        } else {
            System.out.println(String.format("Te recomiendo %s", movi));
        }

        //meto uno de validacion
        //|| es ó
        // && es y
        if (incluidoEnPlan || plan == ("Plus")) {
            System.out.println("Disfrute su pelicula");
        } else {
            System.out.println("Pelicula no apta para su plan");
        }
        //metodo dos validacion
        if (incluidoEnPlan || plan.equals("Plus")) {
            System.out.println("Disfrute su pelicula");
        } else {
            System.out.println("Pelucula no apta en su plan");
        }

        //validacion de de diferencia
        if (incluidoEnPlan && plan.equals("Plus")) {
            System.out.println("Pelicula carga");
        } else {
            System.out.println("Pelicula no disponible");
        }

        //case con switch en letra o numero solo se tiene que agregar el int
        switch (plan) {
            case "Plus":
                System.out.println("Eso Chinga");
            break;
            case "Plan2":
                System.out.println("Eres grance");
                break;
            default:
                System.out.println("Me sorprendes");
        }
    }
}
