package modulo_oop.heranca.desafio;

public class Carro {
    private int statusVelocidade = 0;

    public boolean acelerar() {
        statusVelocidade += 5;
        return true;
    }

    public boolean frear() {

        if (statusVelocidade <= 0) {
            statusVelocidade = 0;
        } else {
            statusVelocidade -= 5;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "statusVelocidade=" + statusVelocidade +
                "} km";
    }

    public int getStatusVelocidade() {
        return statusVelocidade;
    }

    public void setStatusVelocidade(int statusVelocidade) {
        this.statusVelocidade = statusVelocidade;
    }


}