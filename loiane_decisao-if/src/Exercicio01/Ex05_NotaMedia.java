package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex05_NotaMedia {
	/*
	 * 5. Faça um programa para a leitura de duas notas parciais de um aluno. O
	 * programa deve calcular a média alcançada por aluno e apresentar: o A mensagem
	 * "Aprovado", se a média alcançada for maior ou igual a sete; o A mensagem
	 * "Reprovado", se a média for menor do que sete; o A mensagem
	 * "Aprovado com Distinção", se a média for igual a dez.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nota1: " );
		double N1 = scan.nextDouble();
		
		System.out.print("Nota2: " );
		double N2 = scan.nextDouble();
		
		double media = (N1 + N2) /2;
		
		if(media == 10) {
			System.out.println("Aprovado com Disnção - (" + media + ")");
			
		}else if(media >=7) {
			System.out.println("Aprovado - (" + media + ")");
			
		}else {
			System.out.println("Reprovado - (" + media + ")");
		}

		scan.close();
	}

}
