package br.com.fiapride.main;

 import br.com.fiapride.model.Projetor;

 public class SistemaPrincipal {
	
 public static void main(String[] args) {
// INSTANCIAÇÃO
 Projetor projetor1 = new Projetor();
 projetor1.peso = 5;
 projetor1.tamanho = 60;
 projetor1.tipo_fonte = "LED";

 Projetor projetor2 = new Projetor();
 projetor2.peso = 10;
 projetor2.tamanho = 80;
 projetor2.tipo_fonte = "Lâmpada";

 System.out.println("--- Sistema Projetor1 ---");
System.out.println("Peso: " + projetor1.peso);
System.out.println("Tamanho: " + projetor1.tamanho);
System.out.println("Tipo de Fonte Luz: " + projetor1.tipo_fonte);

System.out.println();

System.out.println("--- Sistema Projetor2 ---");
System.out.println("Peso: " + projetor2.peso);
System.out.println("Tamanho: " + projetor2.tamanho);
System.out.println("Tipo de Fonte Luz: " + projetor2.tipo_fonte);



  }
 }
