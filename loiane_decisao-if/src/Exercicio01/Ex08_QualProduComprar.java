package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex08_QualProduComprar {
	/*
	 * 8. Faça um programa que pergunte o preço de três produtos e informe qual
	 * produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Maior número: ");
		
		System.out.print("Produto A - R$: ");
		double a = scan.nextDouble();
		
		System.out.print("Produto B - R$: ");
		double b = scan.nextDouble();
		
		System.out.print("Produto c - R$: ");
		double c = scan.nextDouble();

		if (a < b && a < c) {
			System.out.println("A = " + a);

		} else if (b < a && b < c) {
			System.out.println("B = " + b);

		} else {
			System.out.println("C = " + c);
		}

		scan.close();
	}

}
