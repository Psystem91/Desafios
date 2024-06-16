import Compra.Compra;

import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito{

    private double limite;
    private  double saldo;
    private List<Compra> listaDeCompra;

    //contructor
    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompra = new ArrayList<>();
    }


    public boolean lanzarComprar(Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.listaDeCompra.add(compra);
            return true;
        }
        return false;
    }



    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompra() {
        return listaDeCompra;
    }
}


