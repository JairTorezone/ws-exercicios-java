package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex11_NumerosInteirosABC {
	/*
	 * 11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e
	 * mostre: a. o produto do dobro do primeiro com metade do segundo . b. a soma
	 * do triplo do primeiro com o terceiro. c. o terceiro elevado ao cubo.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		double n3 = scan.nextDouble();
		
		double A = n1 *2 + n2/2;
		double B = n1 * 3 + n3;
		double C = Math.pow(n3, 3);
		
		System.out.println("A: " + A);
		System.out.println("B: " + B);
		System.out.println("C: " + C);
		
		scan.close();

	}

}
