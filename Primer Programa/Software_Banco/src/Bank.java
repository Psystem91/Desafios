import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nombre = "Samuel Bravo";
        String tipoDeCuenta = "Ahorro";
        double saldoDisponible = 4356.89;
        int opcion = 0;

        System.out.println("*****************************");

        // \n es para el pie salto
        System.out.println("\nNombre del Cliente: " + nombre);
        System.out.println("Tipo de Cuenta: " + tipoDeCuenta);
        System.out.println("Saldo Disponible: $" + saldoDisponible);

        System.out.println("\n*****************************");

        String menu = """
                ** Escibe la opcion deseada **
                1 - Consulta de Saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(nombre);
                    break;
            }

        }
    }
}
