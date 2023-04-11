package com.arthur_vsl.project.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<Campo> campos = new ArrayList<Campo>();

	public Tabuleiro(int linha, int coluna, int minas) {
		this.linhas 	= linha;
		this.colunas 	= coluna;
		this.minas 		= minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}
	
	public void abrirCampo(int linha, int coluna) {
		campos.parallelStream()
			.filter(c -> c.getLinha() == linha)
			.filter(c -> c.getColuna() == coluna)
			//ou: .filter(c ->c.getLinha() == linha && c.getColuna() == coluna);
			.findFirst()
			.ifPresent(c -> c.abraCampo());
	}
	
	public void marcarCampo(int linha, int coluna) {
		campos.parallelStream()
		.filter(c -> c.getLinha() == linha)
		.filter(c -> c.getColuna() == coluna)
		.findFirst()
		.ifPresent(c -> c.alterneMarcacao());
	}
	
	private void gerarCampos() {
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				campos.add(new Campo(i,j));
			}			
		}
	}

	private void associarVizinhos() {
		for(Campo c1: campos) {
			for(Campo c2: campos) {
				c1.addVizinhos(c2);
			}
		}
	}
	private void sortearMinas() {
		long totMinasArmadas;
		Predicate<Campo> minado = c -> c.isMinado();
		do {
			totMinasArmadas = campos.stream()
									.filter(minado)
									.count();
			int randomPosition = (int) (Math.random() * campos.size());
			campos.get(randomPosition).minarCampo();
		} while (totMinasArmadas < minas);
	}
	
	private boolean objetivoAlcancado() {
		boolean resultado = campos.stream()
								.allMatch(c -> c.objetivoAlcancado());
		return resultado;
	}
	
	private void reiniciar() {
		campos.forEach(c -> c.reiniciar());
		sortearMinas();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int posicao = 0;
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				sb.append(" ");
				sb.append(campos.get(posicao));
				sb.append(" ");
				posicao++;
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
}