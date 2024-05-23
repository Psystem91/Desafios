import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double media = 0;


        for (int i = 0; i < 4; i++) {

            System.out.println("Coloca Calificacion");
            nota = teclado.nextDouble();
            media = media + nota;
            //media += nota;


        }

    System.out.println(String.format("La calificacion es: %.2f",media / 4));

    }
}
