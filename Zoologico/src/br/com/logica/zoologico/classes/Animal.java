package br.com.logica.zoologico.classes;

	// Construindo o objeto animal
public class Animal {

	// Atributos ou propiedades do objetos
	// Neste momento as propriedades são públicas
	private String nome;
	private String especie;
	private int idade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
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
