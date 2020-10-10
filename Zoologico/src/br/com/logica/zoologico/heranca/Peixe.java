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
		if(estaVivo) {
			System.out.println("BlubBlub");
		}else {
			System.out.println("O animal morreu *I try so hard and I got so far, but in the end is doesn´t even matter*");
		}
		
	}
	
	public boolean isAdulto() {
		if(isEstaVivo()) {
			return idade > 1;
		}else {
			return false;
		}
	}
	
	public void morrer() {
		this.estaVivo = false;
	}
}
