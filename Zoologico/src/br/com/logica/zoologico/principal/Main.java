package br.com.logica.zoologico.principal;

import br.com.logica.zoologico.heranca.Cachorro;
import br.com.logica.zoologico.heranca.Gato;
import br.com.logica.zoologico.heranca.Peixe;

public class Main {

	public static void main(String[] args) {
		
		// Criando uma nova instancia do objeto
		Cachorro cachorro = new Cachorro("Nina", "Cachorro", "Branco", 4);
		
		System.out.println("Ol� o nome do meu animal � " + cachorro.getNome() + " ele tem " + cachorro.getIdade() + " ele � um "
				+ cachorro.getEspecie() + " e ele tem uma cor " + cachorro.getCorPelo());
		
		//cachorro.morrer();
		cachorro.emitirSom();
		
		if(cachorro.isAdulto()) {
			System.out.println("� adulto");
		} else {
			System.out.println("N�o � adulto");
		}
		
		System.out.println("Est� vivo? " + cachorro.isEstaVivo());
		
		System.out.println("----------------------------------------------------------------------------------");
		
		// Criando uma nova instancia do objeto
		Gato gato = new Gato("Zorro", "Gato", "Laranja", 1);
		
		System.out.println("Ol� o nome do meu animal � " + gato.getNome() + " ele tem " + gato.getIdade() + " ele � um "
				+ gato.getEspecie() + " e ele tem uma cor " + gato.getCorPelo());
		
		//gato.morrer();
		gato.emitirSom();
		
		if(gato.isAdulto()) {
			System.out.println("� adulto");
		} else {
			System.out.println("N�o � adulto");
		}
		
		System.out.println("Est� vivo? " + gato.isEstaVivo());
		
		System.out.println("----------------------------------------------------------------------------------");
		
		Peixe peixe = new Peixe("Dory", "Peixe", "Azul", 2);
		
		System.out.println("Ol� o nome do meu animal � " + peixe.getNome() + " ele tem " + peixe.getIdade() + " ele � um "
				+ peixe.getEspecie() + " e ele tem uma cor " + peixe.getCorPelo());
		
		System.out.println("BEIJE O PEIXE!!!");
		
		//peixe.morrer();
		peixe.emitirSom();
		
		if(gato.isAdulto()) {
			System.out.println("� adulto");
		} else {
			System.out.println("N�o � adulto");
		}
		
		System.out.println("Est� vivo? " + peixe.isEstaVivo());
	}
}
