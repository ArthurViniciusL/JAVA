package modulo_oop.composicao;

import java.util.ArrayList;
import java.util.List;
public class Cliente {
    //As intancias não alteradas, por isso: final;
    public final String nome;
    //Um Cliente pode possuir várias compras:
    public final List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void addCompra(Compra p_compra) {
        this.compras.add(p_compra);
    }

    public double obeterValorTotal() {
        double total = 0;
        for (Compra compra : compras) {
            total += compra.pegarValorTotal(); //da compra.
        }
        return total;
    }
}
