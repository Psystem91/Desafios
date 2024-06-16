import Compra.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int opcion = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Limite de tarjeta");
        double limite = teclado.nextDouble();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        while (opcion !=9){

            System.out.println("Artuculo Comprado");
            String articulo = teclado.next();

            System.out.println("Valor de compra");
            double valor = Double.valueOf(teclado.next());

            Compra compra = new Compra(valor, articulo);
            boolean compraRealizada = tarjeta.lanzarComprar(compra);

            if (compraRealizada){
                System.out.println("Compra Realizada");
                System.out.println("Coloca 1 para seguir comprando o 9 para salir");
                opcion = teclado.nextInt();
            }else {
                System.out.println("Saldo insuficiente");
                opcion = 9;
            }
        }

        System.out.println("*****************************");
        System.out.println("Compras realizadas:\n");
        Collections.sort(tarjeta.getListaDeCompra());
        // : es para validar si es true Valor 1 (Compra compra), de lo contrario Valor 2
        // (Tarjeta.getListaDeCompra())
        for (Compra compra : tarjeta.getListaDeCompra()){
            System.out.println(compra.getDescripcion()+ "-" + compra.getValor());
        }
        System.out.println("*****************************\n");
        System.out.println("Saldo en tarjeta $" + tarjeta.getSaldo());








    }
}
