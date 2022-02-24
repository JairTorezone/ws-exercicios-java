package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex09_OrdemDecrescente {
	/*
	 * 9. Faça um Programa que leia três números e mostre-os em ordem decrescente.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Maior e o menor número: ");

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if (a < b && a < c) {
			if (b < c) {
				System.out.println("> " + a);
				System.out.println("> " + b);
				System.out.println("> " + c);
			} else {
				System.out.println("> " + a);
				System.out.println("> " + c);
				System.out.println("> " + b);
			}

		} else if (b < a && b < c) {
			if (a < c) {
				System.out.println("> " + b);
				System.out.println("> " + a);
				System.out.println("> " + c);
			} else {
				System.out.println("> " + b);
				System.out.println("> " + c);
				System.out.println("> " + a);
			}

		} else {
			if (a < b) {
				System.out.println("> " + c);
				System.out.println("> " + a);
				System.out.println("> " + b);
			} else {
				System.out.println("> " + c);
				System.out.println("> " + b);
				System.out.println("> " + a);
			}
		}

		scan.close();
	}

}
