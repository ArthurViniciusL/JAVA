package modulo_oop.composicao;
public class Main {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.addItem("Caneta", 9.67, 100);
        //Com instancia:
        compra1.addItem(new Produto("PC", 1897.88), 2);

        Compra compra2 = new Compra();
        compra2.addItem("Caderno", 10, 10);
        //Com instancia:
        compra2.addItem(new Produto("Impressora", 998.90), 1);

        Cliente cliente = new Cliente("Arthur");
        cliente.addCompra(compra1);
        cliente.addCompra(compra2);

        System.out.println("TOTAL: " + cliente.obeterValorTotal());

    }
}
