package br.com.logica.zoologico.classes;

	// Construindo o objeto animal
public abstract class Animal {

	// Atributos ou propiedades do objetos
	// Neste momento as propriedades são públicas
	private String nome;
	private String especie;
	private String corPelo;
	private int idade;
	
	// Construtor padrão java
	// NÃO DEVE ULTILIZAR
	/*
	 * public Animal() {
	 * 
	 * }
	 */
	
	public Animal(String nome, String especie, String corPelo, int idade) {
		this.nome = nome;
		this.especie = especie;
		this.corPelo = corPelo;
		this.idade = idade;
	}
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public String getCorPelo() {
		return corPelo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void emitirSom() {
		System.out.println("Som do animal");
	}
	
	public boolean isAdulto() {
		return idade >= 1;
	}
}
