package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.heranca.Cachorro;
import br.com.logica.zoologico.heranca.Gato;
import br.com.logica.zoologico.heranca.Peixe;

public class Main {

	public static void main(String[] args) {
		
		// Criando uma nova instancia do objeto
		Cachorro cachorro = new Cachorro("Nina", "Cachorro", "Branco", 4);
		
		System.out.println("Olá o nome do meu animal é " + cachorro.getNome() + " ele tem " + cachorro.getIdade() + " ele é um "
				+ cachorro.getEspecie() + " e ele tem uma cor " + cachorro.getCorPelo());
		
		//cachorro.morrer();
		cachorro.emitirSom();
		
		if(cachorro.isAdulto()) {
			System.out.println("É adulto");
		} else {
			System.out.println("Não é adulto");
		}
		
		System.out.println("Está vivo? " + cachorro.isEstaVivo());
		
		System.out.println("----------------------------------------------------------------------------------");
		
		// Criando uma nova instancia do objeto
		Gato gato = new Gato("Zorro", "Gato", "Laranja", 1);
		
		System.out.println("Olá o nome do meu animal é " + gato.getNome() + " ele tem " + gato.getIdade() + " ele é um "
				+ gato.getEspecie() + " e ele tem uma cor " + gato.getCorPelo());
		
		//gato.morrer();
		gato.emitirSom();
		
		if(gato.isAdulto()) {
			System.out.println("É adulto");
		} else {
			System.out.println("Não é adulto");
		}
		
		System.out.println("Está vivo? " + gato.isEstaVivo());
		
		System.out.println("----------------------------------------------------------------------------------");
		
		Peixe peixe = new Peixe("Dory", "Peixe", "Azul", 2);
		
		System.out.println("Olá o nome do meu animal é " + peixe.getNome() + " ele tem " + peixe.getIdade() + " ele é um "
				+ peixe.getEspecie() + " e ele tem uma cor " + peixe.getCorPelo());
		
		System.out.println("BEIJE O PEIXE!!!");
		
		//peixe.morrer();
		peixe.emitirSom();
		
		if(gato.isAdulto()) {
			System.out.println("É adulto");
		} else {
			System.out.println("Não é adulto");
		}
		
		System.out.println("Está vivo? " + peixe.isEstaVivo());
	}
}
