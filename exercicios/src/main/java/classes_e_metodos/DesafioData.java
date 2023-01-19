package classes_e_metodos;

public class DesafioData {
	//dados
	private int dia;
	private int mes;
	private int ano;
	
	//construtor
	public DesafioData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	//construtor com valor default
	public DesafioData() {
		this(1, 1, 1970);
	}	
	
	//m?tdos
	public String formateData() {
		return String.format("%d-%d-%d" ,dia, mes, ano);
	}
	
	public void exibaDataFormatada() {
		System.out.println(formateData());
	}
}

