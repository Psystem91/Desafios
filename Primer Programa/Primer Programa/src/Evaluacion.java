import java.util.Scanner;

public class Evaluacion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota = 0;
        double media = 0;
        double contador = 0;


        //es para cuando se detenga la aplicacio
        //! = diferente
        while (nota != -1){

            System.out.println("Coloca Calificacion");
            if (nota != -1) {
                nota = teclado.nextDouble();
                media += nota;
                contador++;
            }
        }
        System.out.println(String.format("La calificacion es: %.2f",media / contador));
    }
}
