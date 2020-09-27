package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.classes.Animal;

public class Main {

	public static void main(String[] args) {
		// Criando uma nova instancia do objeto
		Animal a1 = new Animal();
		
		//Atribuindo os valores as propriedades
		a1.nome = "Nina";
		a1.especie = "cachorro";
		a1.idade = 3;
		
		// Criando uma nova instancia do objeto
		Animal a2 = new Animal();
		
		// Atribuindo os valores as propriedades
		a2.nome = "zorro";
		a2.especie = "gato";
		a2.idade = 3;
	}
}
