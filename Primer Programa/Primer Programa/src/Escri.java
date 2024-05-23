public class Escri {
    public static void main(String[] args) {

        //Operadores logico Y (and)= &&  o (or) = ||
        //para colocar variable de escritura en bajo un concatenado
        String nombreUno = "Samuel Bravo";
        String saludo = "Hola";
        String mensajeUno = saludo + nombreUno + " chingon";
        System.out.println(mensajeUno);

        //comparacion
        String contraseña = "12345";
        if (contraseña.equals("12345")) {
            System.out.println("Acceso Correcto");
        } else {
            System.out.println("Contraseña Incorrecta");
        }
        //forma de dar formato a string
        //Enteros byte, short, int, long
        //punto flotante double y float
        //char contiene un solo caracter
        //Boolean que puede tener dos valores true y false
        //%s es para texto
        //%d es para numero
        //%.2f es para numeros decimales
        String  nombreDos= "Samuel";
        int edad = 30;
        double valor = 55.999;
        System.out.println(String.format("Mi nombre es %s, tengo %d  años y hoy gaste %.2f dolares", nombreDos, edad, valor));

        //Bloque de texto string
        String nombreTres = "Samuel Bravo";

        int aula = 4;
        //correccion
        String mesanjeDos = """
               Hola, %s Bienvenido al curso de java tendremos %d aulas para mostrarte
               lo que es necesario para que puedas dar tus primeros pasos en este lenguaje
                """;
        System.out.println(mesanjeDos);
        //Correcto
        System.out.println(String.format("Hola %s Bienvenido al curso de java tendremos %d aulas para mostrarte " +
                        "lo que es necesario para que puedas dar tus primeros pasos en este lenguaje", nombreDos, aula));

        //formato de escritura y numeracion Casting
        //Casting implicito

        int x1 = 10;
        double y1 = x1;
        System.out.println(y1);

        //Casting explicito

        double x2 = 10.5;
        int y2 = (int) x2;
        System.out.println(y2);


    }
}
