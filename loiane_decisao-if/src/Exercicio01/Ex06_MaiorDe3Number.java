package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex06_MaiorDe3Number {
	/*
	 * 6. Faça um Programa que leia três números e mostre o maior deles.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Maior número: ");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a > b && a > c) {
			System.out.println(a);
			
		}else if(b > a && b > c) {
			System.out.println(b);
			
		}else {
			System.out.println(c);
		}
		
		scan.close();
	}

}
