package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.classes.Animal;

public class Main {

	public static void main(String[] args) {
		
		// Criando uma nova instancia do objeto
		Animal cachorro = new Animal("Nina", "Cachorro", 2);
		
		System.out.println("Olá o nome do meu animal é " + cachorro.getNome());
		
		cachorro.emitirSom();
		
		if(cachorro.isAdulto()) {
			System.out.println("É adulto");
		} else {
			System.out.println("Não é adulto");
		}
		
		System.out.println("--------------------------------");
		
		// Criando uma nova instancia do objeto
		Animal gato = new Animal("Zorro", "Gato", 1);
		
		System.out.println("Olá o nome do meu animal é " + gato.getNome());
		
		gato.emitirSom();
		
		if(gato.isAdulto()) {
			System.out.println("É adulto");
		} else {
			System.out.println("Não é adulto");
		}
		
		Animal peixe = new Animal("Dory");
		
		System.out.println("Olá o nome do meu animal é " + peixe.getNome());
		
		peixe.setEspecie("Peixe");
		peixe.setIdade(1);
		
		peixe.emitirSom();
		
		if(gato.isAdulto()) {
			System.out.println("É adulto");
		} else {
			System.out.println("Não é adulto");
		}
	}
}
