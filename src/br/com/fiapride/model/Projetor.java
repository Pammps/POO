package br.com.fiapride.model;

public class Projetor {

	// atributos
	private int peso;
	private double tamanho;
	private String tipoFonte;
	private boolean ligado;

	// construtor
	public Projetor(int peso, double tamanho, String tipoFonte) {
		this.peso = peso;
		this.tamanho = tamanho;
		this.tipoFonte = tipoFonte;
		this.ligado = false;
	}

	// GETTERS

	public int getPeso() {
		return peso;
	}

	public double getTamanho() {
		return tamanho;
	}

	public String getTipoFonte() {
		return tipoFonte;
	}

	public boolean isLigado() {
		return ligado;
	}

	// SETTERS

	public void setPeso(int peso) {

		// REGRA DE NEGÓCIO
		if (peso <= 0) {
			System.out.println("Peso inválido!");
			return;
		}

		this.peso = peso;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public void setTipoFonte(String tipoFonte) {
		this.tipoFonte = tipoFonte;
	}

	// MÉTODOS

	public void ligar() {

		if (ligado) {
			System.out.println("O projetor já está ligado.");
		} else {
			ligado = true;
			System.out.println("Projetor ligado.");
		}
	}

	public void desligar() {

		if (!ligado) {
			System.out.println("O projetor já está desligado.");
		} else {
			ligado = false;
			System.out.println("Projetor desligado.");
		}
	}

	public void projetarImagem(String imagem) {

		if (!ligado) {
			System.out.println("Não é possível projetar. O projetor está desligado.");
			return;
		}

		System.out.println("Projetando imagem: " + imagem);
	}
}