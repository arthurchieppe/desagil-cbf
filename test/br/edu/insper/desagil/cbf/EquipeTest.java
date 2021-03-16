package br.edu.insper.desagil.cbf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipeTest {
	private Equipe equipe;

	@BeforeEach
	public void setUp() {
		equipe = new Equipe("Engenharia de Computação");
	}

	@Test
	public void adicionaUmJogador() {
		Jogador jogador = new Jogador("João", 10, 20, 30);
		equipe.adicionaJogador(jogador);
		assertEquals(1, equipe.getNumJogadores());
		assertEquals("João", equipe.getJogador(0).getNome());
	}

	@Test
	public void adicionaDoisJogadores() {
		Jogador jogador1 = new Jogador("João", 10, 20, 30);
		Jogador jogador2 = new Jogador("Maria", 35, 25, 15);
		equipe.adicionaJogador(jogador1);
		equipe.adicionaJogador(jogador2);
		assertEquals(2, equipe.getNumJogadores());
		assertEquals("João", equipe.getJogador(0).getNome());
		assertEquals("Maria", equipe.getJogador(1).getNome());
	}
}
