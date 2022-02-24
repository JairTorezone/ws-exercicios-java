package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex12_PesoIdeal {
	/*
	 * 12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo
	 * que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Peso ideal: " + pesoIdeal);

		scan.close();

	}

}
