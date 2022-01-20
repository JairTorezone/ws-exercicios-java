package Exercicio01;

import java.util.Scanner;

public class Ex04_MediaNotas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a 1 nota: ");
		double n1 = scan.nextDouble();
		
		System.out.print("Digite a 2 nota: ");
		double n2 = scan.nextDouble();
		
		System.out.print("Digite a 3 nota: ");
		double n3 = scan.nextDouble();
		
		System.out.print("Digite a 4 nota: ");
		double n4 = scan.nextDouble();
		
		double media = (n1 + n2 + n3 +n4) /4;
		
		System.out.println("Média " + media);
		
		scan.close();

	}

}
