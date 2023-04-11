package com.arthur_vsl.proeject.modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.arthur_vsl.project.modelo.Campo;
import com.arthur_vsl.project.modelo.ExplosaoException;

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
	void testVizinhoRealDist01Esquerda() {
		//	Em vez de: Campo vizinho 		= new Campo(3, 2); ou
		//	Campo vizinho = vizinho(3, 2); repetidamente, transforme em função.
		
		boolean resultado 	= objCampo.addVizinhos(vizinho(3, 2));
		
		//	Sendo o resultado "true", o teste e aceito. Caso contrario, ele e recusado
		assertTrue(resultado);
	}
	
	@Test	
	void testVizinhoRealDist01Direita() {
		
		boolean resultado 	= objCampo.addVizinhos(vizinho(3, 4));
		assertTrue(resultado);
	}
	
	@Test	
	void testVizinhoRealDist01Emcima() {
		boolean resultado 	= objCampo.addVizinhos(vizinho(2, 3));
		assertTrue(resultado);
	}
	
	@Test
	void testNaoViznho() {
		boolean resultado 	= objCampo.addVizinhos(vizinho(1, 1));
		assertFalse(resultado);
	}
	
	@Test
	void testValorPadraoAtributoMarcado() {
		assertFalse(objCampo.isMarcado());
	}
	
	@Test
	void testAlternarMarcacao() {
		objCampo.alterneMarcacao();
		assertTrue(objCampo.isMarcado());
	}
	
	@Test
	void testAlternarMarcacaoDuasChamadas() {
		objCampo.alterneMarcacao();
		objCampo.alterneMarcacao();
		assertFalse(objCampo.isMarcado());
	}
	
	@Test
	void testAbrirCampoNaoMinadoNaoMarcado() {
		assertTrue(objCampo.abraCampo());
	}
	
	@Test
	void testAbrirCampoNaoMinadoMarcado() {
		objCampo.alterneMarcacao();
		assertFalse(objCampo.abraCampo());
		
	}
	
	@Test
	void testAbrirCampoMinadoMarcado() {
		objCampo.alterneMarcacao();
		objCampo.minarCampo();
		assertFalse(objCampo.abraCampo());
		
	}
	
	@Test
	void testAbrirCampoMinadoNaoMarcado() {
		objCampo.minarCampo();
		
		assertThrows(ExplosaoException.class, () -> {
			objCampo.abraCampo();
		});
		assertFalse(objCampo.abraCampo());
		
	}
	void testAbrirComVizinho() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 1);
		
		Campo campo22 = new Campo(2, 2);
		objCampo.addVizinhos(campo11);
		objCampo.addVizinhos(campo12);
		
		objCampo.abraCampo();
		
		assertTrue(campo22.isAberto() && campo11.isFechado());
	}
}