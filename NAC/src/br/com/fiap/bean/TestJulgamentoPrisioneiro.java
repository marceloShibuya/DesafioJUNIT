package br.com.fiap.bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.fiap.bean.JulgamentoPrisioneiro.Resposta;

class TestJulgamentoPrisioneiro {

	@DisplayName("Calcula Pena")
	@Test
	void testCalculaPena() {

		Resposta respostaPrisioneiroA = Resposta.DELACAO;
		Resposta respostaPrisioneiroB = Resposta.DELACAO;

		JulgamentoPrisioneiro jp = new JulgamentoPrisioneiro();
		assertNotNull(jp);

		int prisioneiroA = jp.calculaPena(respostaPrisioneiroA, respostaPrisioneiroB);
		int prisioneiroB = jp.calculaPena(respostaPrisioneiroB, respostaPrisioneiroA);

		assertEquals(15, prisioneiroA);
		assertEquals(15, prisioneiroB);

	}
}
