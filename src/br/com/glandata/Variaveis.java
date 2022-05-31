package br.com.glandata;

public class Variaveis {

	public static void main(String[] args) {
		System.out.println("Variáveis em Java");
		
		// Existe a possibilidade de criar uma variavel sem declarar o tipo. 
		// O tipo sera definido pelo valor atribuido. NAO USAR ESTA FORMA
		
		var numero0 = 10;
		
		System.out.println("Valor da variável numero0: " + numero0);

		String nome = "Kelly";
		
		// Tipos primitivos
		
		boolean verifica = true;
		float numero1 = 2.5f;
		char caracter = 'b';
		int numero2 = 5;
		Integer numero3 = 10;
		
		System.out.println("Resultado: " + (numero2 + numero3) + " Kelly" );
		
	}

}
