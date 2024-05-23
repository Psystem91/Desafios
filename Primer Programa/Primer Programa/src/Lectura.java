import jdk.jshell.execution.StreamingExecutionControl;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner; //primero se debe de importar la clase scanner para la entrada al teclado

public class Lectura {

    public static void main(String[] args) {
        //para poder tener la entrada del teclado
        Scanner teclado = new Scanner(System.in);
//
//        System.out.println("Escribe tu Pelicula");
//        String pelicula = teclado.nextLine();
//
//        System.out.println("Fecha de Lanzamiento");
//        int fechaLazamiento = teclado.nextInt();
//
//        System.out.println("Calificacion");
//        double nota = teclado.nextDouble();
//
//        System.out.println(pelicula);
//        System.out.println(fechaLazamiento);
//        System.out.println(nota);

        //Ejercicio

        System.out.println("Nombre: ");
        String name = teclado.nextLine();

        System.out.println("Edad: ");
        int yeard = teclado.nextInt();

        System.out.println("Dinero a depositar: ");
        double money = teclado.nextDouble();

        System.out.println("Hola " + name + " confirmo que la edad " + yeard + " años esta autorizado para " +
                "realizar el deposito a cuenta con la cantidad de $" + money);

        teclado.close();


    }
}
