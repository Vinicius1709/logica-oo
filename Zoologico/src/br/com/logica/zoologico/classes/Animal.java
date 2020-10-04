package br.com.logica.zoologico.classes;

	// Construindo o objeto animal
public abstract class Animal {

	// Atributos ou propiedades do objetos
	// Neste momento as propriedades são públicas
	private String nome;
	private String especie;
	private String corPelo;
	private int idade;
	protected boolean estaVivo;
	
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
		this.estaVivo = true;
	}
	
	public Animal(String nome) {
		this.nome = nome;
		this.estaVivo = true;
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
	
	public abstract void emitirSom();
	
	public boolean isAdulto() {
		if(estaVivo) {
			return idade >= 5;
		}else {
			return false;
		}
	}
	
	public boolean isEstaVivo() {
		return estaVivo;
	}
	
	public void morrer() {
		this.estaVivo = false;
	}
}
