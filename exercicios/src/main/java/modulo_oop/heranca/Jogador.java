package modulo_oop.heranca;

public class Jogador {
    //Posicao:
    private int x;
    private int y;

    private int barraVida = 100;

    public boolean atacar(Jogador p_oponente) {
        boolean saida = false;
        int deltaX = Math.abs(x - p_oponente.x);
        int deltaY = Math.abs(y - p_oponente.y);

        int linha = 1;
        int coluna = 0;

        if (deltaX == 0 && deltaY == 1) {
            p_oponente.barraVida -= 10;
            saida = true;
        } else if (deltaX == 1 && deltaY == 0) {
            p_oponente.barraVida -= 10;
            saida = true;
        } else {
            saida = false;
        }
        return saida;
    }

    public boolean andar(Direcao p_direcao) {
        switch (p_direcao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getBarraVida() {
        return barraVida;
    }

    public void setBarraVida(int barraVida) {
        this.barraVida = barraVida;
    }
}
