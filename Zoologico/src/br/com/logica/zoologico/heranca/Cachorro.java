package br.com.logica.zoologico.heranca;

import br.com.logica.zoologico.classes.Animal;

public class Cachorro extends Animal {

	public Cachorro(String nome, String especie, String corPelo, int idade) {
		super(nome, especie, corPelo, idade);
	}
	
	public Cachorro(String nome) {
		super(nome);
	}
}
