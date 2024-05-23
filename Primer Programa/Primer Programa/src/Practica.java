import java.util.Random;
import java.util.Scanner;

public class Practica {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int intentos = new Random().nextInt(100);// genera un numero aleatorio
        int contador = 0;

        System.out.println("Adivina un numero del 0 al 100");
        //System.out.println(intentos);

        while (contador < 5){

            int numeroAdivinar = teclado.nextInt();
            contador++;

            if (numeroAdivinar == intentos) {
                System.out.println("Felicidades adivinaste el numero secreto: " + intentos + " en " + contador +
                " Intentos");
                break; //detiene todo el loop de while
            } else if (numeroAdivinar < intentos){
                System.out.println("El numero es mayor");
            }else {
                System.out.println("El numero es menor");
            }

            if (contador == 5){
                System.out.println("Lo siento, no adivinaste el numero, el numero correcto es: " + intentos );
            }

        }
    }
}
