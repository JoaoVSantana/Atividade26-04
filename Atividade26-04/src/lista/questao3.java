package lista;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String seq;


		System.out.println("Digite uma sequência de caracteres: ");
		seq = leia.next();

		
		System.out.println(valor(seq));

		leia.close();
	}

	static int valor(String seq) {

		int somaDigitos = 0, somaLetras = 0;

		char aux;

		for (int cont = 0; cont < seq.length(); cont++) {
			aux = seq.charAt(cont);
			if (Character.toString(aux).matches("[0-9]")) {
				somaDigitos++;
			} else if (Character.toString(aux).matches("[A-Z]") || Character.toString(aux).matches("[a-z]")) {
				somaLetras++;
			} else {
				return -1;
			}
		}

		if (somaDigitos >= somaLetras) {
			return 0;

		} else {
			return 1;
		}
	}
}
