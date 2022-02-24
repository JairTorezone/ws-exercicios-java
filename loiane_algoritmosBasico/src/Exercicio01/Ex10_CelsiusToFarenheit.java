package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex10_CelsiusToFarenheit {
	/*
	 * 10. Faça um Programa que peça a temperatura em graus Celsius, transforme e
	 * mostre em graus Farenheit.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Graus Celsius: ");
		double c = scan.nextDouble();

		double f = c * 1.8 + 32;

		System.out.println("Farenthiet: " + f);

		scan.close();

	}

}
