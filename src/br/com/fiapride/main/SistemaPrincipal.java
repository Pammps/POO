package br.com.fiapride.main;

import br.com.fiapride.model.Projetor;

public class SistemaPrincipal {

	public static void main(String[] args) {

		// INSTANCIAÇÃO
		Projetor projetor1 = new Projetor(5, 60, "LED");
		Projetor projetor2 = new Projetor(10, 80, "Lâmpada");

		System.out.println("--- Sistema Projetor1 ---");
		System.out.println("Peso: " + projetor1.peso);
		System.out.println("Tamanho: " + projetor1.tamanho);
		System.out.println("Tipo de Fonte Luz: " + projetor1.tipoFonte);

		System.out.println();

		System.out.println("--- Sistema Projetor2 ---");
		System.out.println("Peso: " + projetor2.peso);
		System.out.println("Tamanho: " + projetor2.tamanho);
		System.out.println("Tipo de Fonte Luz: " + projetor2.tipoFonte);

		System.out.println();

		// TESTES

		System.out.println("Teste projetar sem ligar:");
		projetor1.projetarImagem("Apresentação FIAP");

		System.out.println();

		System.out.println("Ligando projetor:");
		projetor1.ligar();

		System.out.println();

		System.out.println("Projetando imagem:");
		projetor1.projetarImagem("Slide de POO");

		System.out.println();

		System.out.println("Tentando ligar novamente (valor inválido):");
		projetor1.ligar();

		System.out.println();

		System.out.println("Desligando projetor:");
		projetor1.desligar();

		System.out.println();

		System.out.println("Tentando desligar novamente (valor inválido):");
		projetor1.desligar();
	}
}