package com.arthur_vsl.project.modelo;

import java.util.ArrayList;
import java.util.List;

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
	
}
