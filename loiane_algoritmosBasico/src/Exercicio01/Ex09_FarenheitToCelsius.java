package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex09_FarenheitToCelsius {
	/*
	 * 9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e
	 * mostre a temperatura em graus Celsius. o C = (5 * (F-32) / 9)
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Graus Farenheit: ");
		double f = scan.nextDouble();

		double c = (5 * (f-32)/9);

		System.out.println("Celsius: " + c);

		scan.close();

	}

}
