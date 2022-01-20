package Exercicio01;

import java.util.Scanner;

public class Ex02_MostrarNumTela {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = scan.nextInt();
		
		System.out.println("Número digitado é: " + n);
		
		
		scan.close();

	}

}
