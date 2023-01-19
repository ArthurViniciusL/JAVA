package modulo_oop.composicao;

public class Item {
    //Um item é um produto
    public Produto produto;
    public int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
