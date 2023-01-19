package classes_e_metodos;

public class Produto {
	private String nome;
	private double preco;
	//esse_desconto_sera_aplicado_em_todos_os_produtos
	private static double DESCONTO = 0.25;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public double apliqueDesconto() {
		double novoValor = getPreco() * (1 - DESCONTO);
		return novoValor;
	}
	
	public double apliqueDescontoInGerente(double descoGerente) {
		double novoValor = getPreco() * (1 - DESCONTO + descoGerente);
		return novoValor;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
