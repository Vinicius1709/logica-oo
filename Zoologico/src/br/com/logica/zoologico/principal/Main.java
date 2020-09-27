package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.classes.Animal;

public class Main {

	public static void main(String[] args) {
		// Criando uma nova instancia do objeto
		Animal a1 = new Animal();
		
		// Atribuindo os valores as propriedades
		a1.setNome("Nina");
		a1.setEspecie("Cachorro");
		a1.setIdade(3);
		
		// Criando uma nova instancia do objeto
		Animal a2 = new Animal();
		
		// Atribuindo os valores as propriedades
		a2.setNome("Zorro");
		a2.setEspecie("Gato");
		a2.setIdade(1);
		
		System.out.println("Olá o nome do meu animal é "+ a2.getNome());
	}
}
