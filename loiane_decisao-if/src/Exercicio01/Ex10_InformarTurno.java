package Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Ex10_InformarTurno {
	/*
	 * 10. Faça um Programa que pergunte em que turno você estuda. Peça para digitar
	 * M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!",
	 * "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Informa: M-matutino, V-Vespertino ou N- Noturno. ");
		String valor = scan.next();

		switch (valor) {
		case "M": {

			System.out.println("matutino");
			break;
		}
		case "m": {

			System.out.println("matutino");
			break;
		}
		case "V": {

			System.out.println("Verpertino");
			break;
		}
		case "v": {

			System.out.println("Verpertino");
			break;
		}
		case "N": {

			System.out.println("Noturno");
			break;
		}
		case "n": {

			System.out.println("Noturno");
			break;
		}
		default:
			System.out.println("Valor inválido");
		}

		scan.close();
	}

}
