package br.com.logica.zoologico.heranca;

import br.com.logica.zoologico.classes.Animal;

public class Peixe extends Animal{

	public Peixe(String nome, String especie, String corPelo, int idade) {
		super(nome, especie, corPelo,idade);
	}
	
	public Peixe(String nome) {
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("BlubBlub");
		
	}
}
