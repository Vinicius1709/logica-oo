package br.com.logica.zoologico.heranca;

import br.com.logica.zoologico.classes.Animal;

public class Gato extends Animal{
	
	public Gato(String nome, String especie, String corPelo, int idade) {
		super(nome, especie, corPelo, idade);
	}
	
	public Gato(String nome) {
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		if(estaVivo) {
			System.out.println("Miando");
		}else {
			System.out.println("O animal morreu *Hello darkness my old friend*");
		}
		
	}

}
