package br.com.logica.zoologico.heranca;

import br.com.logica.zoologico.classes.Animal;

public class Cachorro extends Animal {

	public Cachorro(String nome, String especie, String corPelo, int idade) {
		super(nome, especie, corPelo, idade);
	}
	
	public Cachorro(String nome) {
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		if(estaVivo) {
			System.out.println("Latindo");
		}else {
			System.out.println("O animal morreu *Ela partiuUUuuUUUuuu*");
		}
		
	}
	
	public boolean isAdulto() {
		if(isEstaVivo()) {
			return idade> 2;
		}else {
			return false;
		}
	}
	
	public void morrer() {
		this.estaVivo = false;
	}
}
