package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex04_VogalConsoate {
	/*
	 * 4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma letra: ");
		String letra = scan.next();

		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
				|| letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
				||letra.equalsIgnoreCase("u")) {
			
			System.out.println("Fogal");

		} else {
			System.out.println("Consoante");

		} 

		scan.close();
	}

}
