import java.util.Scanner;

public class Bancario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nombre = "Samuel Bravo";
        String tipoDeCuenta = "Ahorro";
        double saldoDisponible = 4356.89;

        String opcion = teclado.nextLine();

        System.out.println("*****************************");

        // \n es para el pie salto
        System.out.println("\nNombre del Cliente: " + nombre);
        System.out.println("Tipo de Cuenta: " + tipoDeCuenta);
        System.out.println("Saldo Disponible: $" + saldoDisponible);

        System.out.println("*****************************");

        System.out.println("**Escriba la opcion deseada**");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Retirar");
        System.out.println("3 - Depositar");
        System.out.println("9 - Salir");

        switch (opcion) {
            case "1":
                System.out.println(saldoDisponible);
            break;


        }




    }
}
