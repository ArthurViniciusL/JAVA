package modulo_oop.heranca.desafio;

public class Main {
    public static void main(String[] args) {
        Ferrai carro1 = new Ferrai();
        System.out.println(carro1.toString());
        carro1.acelerar();
        carro1.acelerar();
        System.out.println(carro1.toString());

        Civic carro2 = new Civic();
        System.out.println(carro2.toString());
        carro2.acelerar();
        System.out.println(carro2.toString());
    }
}