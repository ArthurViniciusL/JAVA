package excecao.personalizada;

@SuppressWarnings("serial")
//exceção do tipo nao checada
public class NumeroForaIntervaloException extends Exception {

    private String nomeDoAtributo;
    public NumeroForaIntervaloException(String p_nome_do_atributo) {
        this.nomeDoAtributo = p_nome_do_atributo;
    }

    public String getMessage() {
        return String.format("O atributo %s não pode ser negativo", nomeDoAtributo);
    }
}
