package modulo_oop.heranca.desafio;

public class Ferrai extends Carro {
    @Override
    public boolean acelerar() {
        int velocidade = getStatusVelocidade() + 15;
        setStatusVelocidade(velocidade);
        return true;
    }
}