package Exercicio01;

import java.util.Scanner;

public class Ex05_ConverterMetrosCentimetros {
//5. Faça um Programa que converta metros para centímetros.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a quantidade metros: ");
		double n1 = scan.nextDouble();
		
		double metroToCentrimentro = n1* 100;
		
		System.out.println(n1 + " metros = " + metroToCentrimentro + " centimetros");
		
		scan.close();

	}

}
