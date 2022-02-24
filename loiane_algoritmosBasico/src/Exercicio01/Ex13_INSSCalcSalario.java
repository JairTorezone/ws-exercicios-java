package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex13_INSSCalcSalario {
	/*
	 * 13. Faça um Programa que pergunte quanto você ganha por hora e o número de
	 * horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
	 * mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o
	 * INSS e 5% para o sindicato, faça um programa que nos dê: . salário bruto. a.
	 * quanto pagou ao INSS. b. quanto pagou ao sindicato. c. o salário líquido. d.
	 * calcule os descontos e o salário líquido, conforme a tabela abaixo:
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Valor por hora R$: ");
		double valorHora = scan.nextDouble();

		System.out.print("Horas trabalhada /mês: ");
		int horasMes = scan.nextInt();

		double SalarioBrutoTotal = valorHora * horasMes;
		double inss = SalarioBrutoTotal* 0.11;
		double sindicato = SalarioBrutoTotal * 0.05;
		double salarioLiquido = SalarioBrutoTotal - (inss + sindicato);

		System.out.println("(A) - Salário bruto: " + String.format("%.2f", SalarioBrutoTotal));
		System.out.println("(B) - INSS: " + String.format("%.2f", inss));
		System.out.println("(C) - SINDICATO: " + String.format("%.2f", sindicato));
		System.out.println("(D) - Salario liquido: " + salarioLiquido);

		scan.close();

	}

}
