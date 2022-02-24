package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex03_VerificarLetra {
	/*
	 * 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
	 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma letra: (F - Feminino, M - Masculino) ");
		String letra = scan.next();
		
		if(letra.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
			
		}else if(letra.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
			
		}else {
			System.out.println("Sexo inválido!");
		}

		

		scan.close();
	}

}
