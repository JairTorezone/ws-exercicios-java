package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_PositivoNegativo {
	/*
	 * 2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo
	 * ou negativo.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int number = scan.nextInt();

		

		if (number > 0) {
			System.out.println(number + " é positivo");
		} else {
			System.out.println(number + " é negativo");
		}

		scan.close();
	}

}
