public class Principal {

    public static void main(String[] args) {

        Pelicula menuPeli = new Pelicula();

        menuPeli.nombre = "Doble Cara";
        menuPeli.duracionEnMinutos = 140;
        menuPeli.fechaDeLazamineto = 1997;

        System.out.println(menuPeli.fichaTecnica);

//        System.out.println("Nombre de la pelicula es: " + menuPeli.nombre);
//        System.out.println("Duracion: " + menuPeli.duracionEnMinutos);

        //saber el id de metodo en la ubicacion de memoria
        System.out.println(menuPeli);

    }
}
