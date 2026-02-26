package br.com.fiapride.model;

public class Projetor {
	
	// atributos (caracteristicas)
	public int peso;
	public double tamanho;
	public String tipoFonteLampada;
	public String tipoFonteLed;
	public boolean ligado;
	
	public Projetor(int peso, double tamanho, String tipo_fonte, boolean ligado) {
		this.peso = peso;
		this.tamanho = tamanho;
		this.tipoFonteLampada = tipoFonteLampada;
		this.tipoFonteLed = tipoFonteLampada;
		this.ligado = ligado;
	}

}

	public void projetarImagem(String imagem) {
		if (ligado) {
			System.out.println("Imagem sendo projetada");
		} else {
			System.out.println("Projetor está desligado");
		return;
		}
		if (tipoFonteLampada == tipoFonteLampada) {
			System.out.println("Projetando com lâmpada amarela"); 
				
		} else if (tipoFonteLed == tipoFonteLed) {
			System.out.println("Projetando com LED");
		}
		
		System.out.println(Imagem + imagem);
		}
	
	public Void emitirSom(double som) {
		if (s)
	}
