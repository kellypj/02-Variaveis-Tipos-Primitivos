package br.com.glandata;

public class ExercicioMedia {

	public static void main(String[] args) {
		// Calcular a média entre 3 notas. Se a nota >= 5, imprimir Aprovado, caso contrário, imprimir Reprovado.
		
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
