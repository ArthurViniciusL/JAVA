package modulo_oop.heranca;

public class Main {
    public static void main(String[] args) {
        Heroi j1 = new Heroi();
        j1.setX(10);
        j1.setY(20);

        Monstro j2 = new Monstro();
        j2.setX(20);
        j2.setY(20);

        for (int i = 0; i < 4; i++) {
            j1.andar(Direcao.NORTE);
        }

        j1.andar(Direcao.LESTE);
        j2.andar(Direcao.OESTE);

        System.out.println(j1.getBarraVida());
        System.out.println(j2.getBarraVida());
    }
}
