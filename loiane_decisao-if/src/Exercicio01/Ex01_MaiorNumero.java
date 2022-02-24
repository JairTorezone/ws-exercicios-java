package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex01_MaiorNumero {
	/* 1. Faça um Programa que peça dois números e imprima o maior deles. */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Número 1: ");
		int num1 = scan.nextInt();
		
		System.out.print("Número 2: ");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + " é maior");
		}else {
			System.out.println(num2 + " é maior");
		}
		
		scan.close();
	}

}
