package br.com.fiapride.model;

public class Projetor {

	// atributos
	public int peso;
	public double tamanho;
	public String tipoFonte;
	public boolean ligado;

	// construtor
	public Projetor(int peso, double tamanho, String tipoFonte) {
		this.peso = peso;
		this.tamanho = tamanho;
		this.tipoFonte = tipoFonte;
		this.ligado = false;
	}

	// método 1 - ligar projetor
	public void ligar() {
		if (ligado == true) {
			System.out.println("O projetor já está ligado.");
		} else {
			ligado = true;
			System.out.println("Projetor ligado.");
		}
	}

	// método 2 - desligar projetor
	public void desligar() {
		if (ligado == false) {
			System.out.println("O projetor já está desligado.");
		} else {
			ligado = false;
			System.out.println("Projetor desligado.");
		}
	}

	// método 3 - projetar imagem
	public void projetarImagem(String imagem) {

		if (ligado == false) {
			System.out.println("Não é possível projetar. O projetor está desligado.");
			return;
		}

		if (tipoFonte.equals("Lâmpada")) {
			System.out.println("Projetando com lâmpada amarela...");
		} else if (tipoFonte.equals("LED")) {
			System.out.println("Projetando com LED...");
		}

		System.out.println("Imagem projetada: " + imagem);
	}
}