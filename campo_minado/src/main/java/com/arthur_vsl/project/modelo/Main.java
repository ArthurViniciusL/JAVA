package com.arthur_vsl.project.modelo;

public class Main {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
		tabuleiro.abrirCampo(3, 3);
		tabuleiro.marcarCampo(2,4);
		System.out.println(tabuleiro);

	}

}
