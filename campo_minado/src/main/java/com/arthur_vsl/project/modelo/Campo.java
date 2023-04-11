package com.arthur_vsl.project.modelo;

import java.util.ArrayList;

public class Campo {
	
	private final int linha;
	private final int coluna;
	
	private boolean aberto 	= false;
	private boolean minado 	= false; 
	private boolean marcado = false;
	
	private ArrayList<Campo> vizinhos = new ArrayList<>();
	

	public Campo(int linha, int coluna) {
		this.linha 	= linha;
		this.coluna = coluna;
	}
	
	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	public boolean addVizinhos(Campo p_vizinho) {
		boolean status = false;
		
		boolean linhaDiferente 	= this.linha != p_vizinho.linha;
		boolean colunaDiferente = this.coluna != p_vizinho.coluna;
		boolean diagonal 		= linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(this.linha - p_vizinho.linha);
		int deltaColuna = Math.abs(this.coluna - p_vizinho.coluna);
		int deltaGeral = (deltaLinha + deltaColuna);
		
		if (deltaGeral == 1 && !diagonal) {
			vizinhos.add(p_vizinho);
			status = true;			
		}
		
		return status;	
	}
	
	public boolean abraCampo() {
		if (isFechado() && !marcado) {
			aberto = true;
		
			if (minado) {
				throw new ExplosaoException();
			}
		
			if (vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abraCampo());
			}
			return true;
		}
		return false;
	}
	
	public void alterneMarcacao() {
		if (isFechado()) {
			marcado = !marcado;
		}		
	}
	
	public boolean vizinhancaSegura() {
		// O resultado dessa expressao (true or false) determina a seguranca da vizinhaca
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	//simplicado	
	public void minarCampo() {
		minado = true;
		
	}
	
	public boolean isMinado() {
		return minado;
	}
	
	public boolean isMarcado() {
		return marcado;
	}
	
	public boolean isAberto() {
		return aberto;
	}
	
	public boolean isFechado() {
		return !aberto;
	}
	
	public boolean objetivoAlcancado() {
		boolean desvendado 	= !minado && aberto;
		boolean protegido 	= minado && marcado;
		
		return desvendado || protegido;
	}
	
	public long minasNaVizinhanca() {
		return vizinhos
				.stream()
				.filter(v -> v.minado)
				.count();
	}
	
	public void reiniciar() {
		this.aberto 	= false;
		this.minado 	= false;
		this.marcado 	= false;
	}

	@Override
	public String toString() {
		
		String marcacao;
		
		if(marcado) {
			marcacao = "x";
		} 
		
		else if(aberto && minado) {
			marcacao = "x";
		} else if(aberto && (minasNaVizinhanca() > 0) ) {
			marcacao =  Long.toString(minasNaVizinhanca());
		} else if(aberto) {
			marcacao = "";
		}
		
		else {
			marcacao = "?";
		}
		
		return marcacao;
	}
	
}
