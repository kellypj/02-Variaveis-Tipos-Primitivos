package br.com.glandata;

public class Variaveis {

	public static void main(String[] args) {
		System.out.println("Vari�veis em Java");
		
		// Existe a possibilidade de criar uma vari�vel sem declarar o tipo e o tipo ser definido pelo valor atribu�do
		// N�o usar desta forma
		
		var numero0 = 10;
		
		System.out.println("Valor da vari�vel numero0: " + numero0);

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
