package Compra;

import javax.management.remote.TargetedNotification;

public class Compra implements Comparable<Compra>{

    private double valor;
    private String descripcion;

    //contructor
    public Compra(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //tostring para que salga bien al imprecion sin codigo
    @Override
    public String toString() {
        return "Compra: valor=" + valor + "Descripcion =" + descripcion;
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.valor));
    }
}
