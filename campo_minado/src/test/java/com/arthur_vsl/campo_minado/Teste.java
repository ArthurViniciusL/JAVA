package com.arthur_vsl.campo_minado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	// notação para teste
	@Test
	// função de teste
	void testarSeIgualADdois() {
		int a = 1 + 1;

		// Servpara validar o meu teste
		// assertEquals(esperado, resultado);
		assertEquals(2, a);
	}

	// caso de erro
	@Test
	public void testarSeIgualATres() {
		int x = 2 + 10 - 7;

		assertEquals(3, x);
	}

	/*
	 * Os testes podem ser feitos com valores fixos ou tbm com valores retornados
	 * por funções e exception
	 */

}
