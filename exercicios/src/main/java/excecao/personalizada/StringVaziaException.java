package excecao.personalizada;

@SuppressWarnings("serial")
//exceção do tipo checada
public class StringVaziaException extends RuntimeException {
    private String nomeDoAtributo;
    public StringVaziaException(String p_nome_do_atributo) {
        this.nomeDoAtributo = p_nome_do_atributo;
    }

    public String getMessage() {

        return String.format("O atributo %s não pode ser null", nomeDoAtributo);
    }
}
