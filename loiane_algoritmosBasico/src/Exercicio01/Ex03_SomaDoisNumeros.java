package Exercicio01;

import java.util.Scanner;

public class Ex03_SomaDoisNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número 1: ");
		int n1 = scan.nextInt();
		
		System.out.print("Digite um número 2: ");
		int n2 = scan.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println("Soma: " + soma);
		
		scan.close();

	}

}
