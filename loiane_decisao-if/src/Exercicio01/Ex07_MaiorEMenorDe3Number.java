package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex07_MaiorEMenorDe3Number {
	/*
	 * 7. Faça um Programa que leia três números e mostre o maior e o menor deles.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Maior e o menor número: ");

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if (a > b && a > c) {
			if(b > c) {
				System.out.println("Maior " + a);
				System.out.println("Menor " + c);
			}else {
				System.out.println("Maior " + a);
				System.out.println("Menor " + b);
			}
			
		} else if (b > a && b > c) {
			if(a > c) {
				System.out.println("Maior " + b);
				System.out.println("Menor " + c);
			}else {
				System.out.println("Maior " + b);
				System.out.println("Menor " + a);
			}

		} else {
			if(a > b) {
				System.out.println("Maior " + c);
				System.out.println("Menor " + b);
			}else {
				System.out.println("Maior " + c);
				System.out.println("Menor " + a);
			}
		}

		scan.close();
	}

}
