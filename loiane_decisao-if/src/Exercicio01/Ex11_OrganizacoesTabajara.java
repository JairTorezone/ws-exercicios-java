package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex11_OrganizacoesTabajara {
	/*
	 * 11. As Organizações Tabajara resolveram dar um aumento de salário aos seus
	 * colaboradores e lhe contraram para desenvolver o programa que calculará os
	 * reajustes. o Faça um programa que recebe o salário de um colaborador e o
	 * reajuste segundo o seguinte critério, baseado no salário atual: o salários
	 * até R$ 280,00 (incluindo) : aumento de 20% o salários entre R$ 280,00 e R$
	 * 700,00 : aumento de 15% o salários entre R$ 700,00 e R$ 1500,00 : aumento de
	 * 10% o salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser
	 * realizado, informe na tela: o o salário antes do reajuste; o o percentual de
	 * aumento aplicado; o o valor do aumento; o o novo salário, após o aumento.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Salário: ");
		double salario = scan.nextDouble();
		
		if(salario <= 280) {
			System.out.println(salario);
			System.out.println("Aumento 20% - R$" + String.format("%.2f", (salario * 0.2)) );
			System.out.println("Salario atual: " + String.format("%.2f",(salario + salario * 0.2)) );
			
		}else if(salario <=700) {
			System.out.println(salario);
			System.out.println("Aumento 15% - R$" + String.format("%.2f", (salario * 0.15)) );
			System.out.println("Salario atual: " + String.format("%.2f",(salario + salario * 0.15)) );
			
		}else if(salario <=1500.0) {
			System.out.println(salario);
			System.out.println("Aumento 10% - R$" + String.format("%.2f", (salario * 0.10)) );
			System.out.println("Salario atual: " + String.format("%.2f",(salario + salario * 0.10)) );
			
		}else {
			System.out.println(salario);
			System.out.println("Aumento 5% - R$" + String.format("%.2f", (salario * 0.05)) );
			System.out.println("Salario atual: " + String.format("%.2f",(salario + salario * 0.05)) );
		}
		

		scan.close();
	}

}
