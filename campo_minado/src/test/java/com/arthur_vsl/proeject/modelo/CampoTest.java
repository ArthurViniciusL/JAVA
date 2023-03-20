package com.arthur_vsl.proeject.modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arthur_vsl.project.modelo.Campo;

public class CampoTest {
	
	private Campo objCampo;
	
	//Inicia a função automaticamente.
	@BeforeEach	
	public void iniciarCampo() {
		objCampo = new Campo(3, 3);
	}
	
	//Gera uma nova instancia do objeto do tipo Campo
	private Campo vizinho(int linha, int coluna) {
		Campo vizinho = new Campo(linha, coluna);		
		return vizinho;
		
	}
	
	@Test	
	public void testVizinhoRealDist01Esquerda() {
		//	Em vez de: Campo vizinho 		= new Campo(3, 2); ou
		//	Campo vizinho = vizinho(3, 2); repetidamente, transforme em função.
		
		boolean resultado 	= objCampo.addVizinhos(vizinho(3, 2));
		
		//	Sendo o resultado "true", o teste e aceito. Caso contrario, ele e recusado
		assertTrue(resultado);
	}
	
	@Test	
	public void testVizinhoRealDist01Direita() {
		
		boolean resultado 	= objCampo.addVizinhos(vizinho(3, 4));
		assertTrue(resultado);
	}
	
	@Test	
	public void testVizinhoRealDist01Emcima() {
		boolean resultado 	= objCampo.addVizinhos(vizinho(2, 3));
		assertTrue(resultado);
	}
	
	@Test
	public void testNaoViznho() {
		boolean resultado 	= objCampo.addVizinhos(vizinho(1, 1));
		assertFalse(resultado);
	}
	

}
