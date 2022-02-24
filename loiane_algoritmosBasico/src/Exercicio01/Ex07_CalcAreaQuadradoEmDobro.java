package Exercicio01;

import java.util.Scanner;

public class Ex07_CalcAreaQuadradoEmDobro {
	//7. Faça um Programa que calcule a área de um quadrado, em seguida 
		//mostre o dobro desta área para o usuário.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lado: ");
		double raio = scan.nextDouble();
		
		
		double area =  Math.pow(raio, 2);
		
		
		System.out.println("Area do quadrado em dobro: " + area * 2);
		
		scan.close();

	}

}
