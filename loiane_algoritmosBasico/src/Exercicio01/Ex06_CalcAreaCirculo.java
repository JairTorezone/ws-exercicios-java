package Exercicio01;

import java.util.Scanner;

public class Ex06_CalcAreaCirculo {
	//6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Raio: ");
		double raio = scan.nextDouble();
		
		
		double area = Math.PI * Math.pow(raio, 2);
		
		
		System.out.println("Area do circulo: " + area);
		
		scan.close();

	}

}
