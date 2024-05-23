import java.util.Scanner;

public class Consultas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nombre = "Samuel Bravo";
        String cuenta = "Ahorro";
        double saldo = 6456.89;
        int opcion = 0;

        System.out.println("*****************************");
        System.out.println("\nNombre del Cliente: " + nombre);
        System.out.println("Tipo de Cuenta: " + cuenta);
        System.out.println("Saldo Diponible: $" + saldo);
        System.out.println("****************************");


        String menu = """
                \n** Selecciona una Opcion **
                1 - Consulta de Saldo
                2 - Retirar
                3 - Deposito
                9 - Salir
                """;


        while (opcion != 9){

            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Su Saldo es: $" + saldo);
                    break;

                case 2:
                    System.out.println("Indique la cantidad a retirar");
                    double cantidad = teclado.nextDouble();
                    if (saldo < cantidad) {
                        System.out.println("Saldo insufiente");
                    } else {
                        saldo -= cantidad;
                        System.out.println("Su Saldo es: $" + saldo);
                    }
                    break;

                case 3:
                    System.out.println("Indique a cantidad a Depositar");
                    double deposito = teclado.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo actual: $" + saldo);
                    break;

                case 9:
                    System.out.println("Gracias por su Visita");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }


}