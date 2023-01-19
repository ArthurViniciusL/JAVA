package modulo_oop.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    //Uma compra pode possuir vários itens:
    List<Item> itens = new ArrayList<>();

    public void addItem(Produto p_produto, int p_quantidade) {
        this.itens.add(new Item(p_produto, p_quantidade));
    }

    public void addItem(String nome, double preco, int qtd) {
        //Gerando uma instancia já na adicção;
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, qtd));
    }

    public double pegarValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
