package beecrowd.iniciante;

import java.util.Scanner;

public class Problem1003_somaAeB {
	/*
	 * Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A
	 * e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo
	 * apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo
	 * especificado e não esqueça de imprimir o fim de linha após o resultado, caso
	 * contrário, você receberá "Presentation Error"
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int SOMA = A + B;
		
		System.out.println("SOMA = " + SOMA);
		
		
		scan.close();
	}

}
