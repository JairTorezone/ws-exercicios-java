package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex08_CalcSalario {
	/*
	 * 8. Faça um Programa que pergunte quanto você ganha por hora e o número de
	 * horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
	 * mês.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Valor por hora R$: ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Horas trabalhada /mês: ");
		int horasMes = scan.nextInt();
		
		double valorTotal = valorHora * horasMes;

		System.out.println("Salário: "+ String.format("%.2f", valorTotal));

		scan.close();

	}

}
