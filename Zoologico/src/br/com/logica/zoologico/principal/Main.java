package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.classes.Animal;

public class Main {

	public static void main(String[] args) {
		
		// Criando uma nova instancia do objeto
		Animal cachorro = new Animal("Nina", "Cachorro", 2);
		
		System.out.println("Ol� o nome do meu animal � " + cachorro.getNome());
		
		cachorro.emitirSom();
		
		if(cachorro.isAdulto()) {
			System.out.println("� adulto");
		} else {
			System.out.println("N�o � adulto");
		}
		
		System.out.println("--------------------------------");
		
		// Criando uma nova instancia do objeto
		Animal gato = new Animal("Zorro", "Gato", 1);
		
		System.out.println("Ol� o nome do meu animal � " + gato.getNome());
		
		gato.emitirSom();
		
		if(gato.isAdulto()) {
			System.out.println("� adulto");
		} else {
			System.out.println("N�o � adulto");
		}
		
		Animal peixe = new Animal("Dory");
		
		System.out.println("Ol� o nome do meu animal � " + peixe.getNome());
		
		peixe.setEspecie("Peixe");
		peixe.setIdade(1);
		
		peixe.emitirSom();
		
		if(gato.isAdulto()) {
			System.out.println("� adulto");
		} else {
			System.out.println("N�o � adulto");
		}
	}
}
