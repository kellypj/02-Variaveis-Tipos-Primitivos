package br.com.glandata;

public class ExercicioMedia {

	public static void main(String[] args) {
		// Calcular a m�dia entre 3 notas. Se a nota >= 5, imprimir Aprovado, caso contr�rio, imprimir Reprovado.
		
		double nota01 = 10;
		double nota02 = 9;
		double nota03 = 8;
		
		if ((nota01 + nota02 + nota03) / 3 > 5) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
	}

}
