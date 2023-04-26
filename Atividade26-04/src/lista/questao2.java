package lista;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String frase1, frase2;
		boolean confirma;
		
		System.out.println("Digite uma frase: ");
		frase1 = leia.next();
		
		System.out.println("Digite novamente uma frase: ");
		frase2 = leia.next();
		
		confirma = checagem(frase1, frase2);
		if(!confirma) {
			System.out.println("As frases não são iguais!");
			
		} else {
			System.out.println("As frases são iguais!");
		}
		
		leia.close();
	}
	static boolean checagem (String frase1, String frase2) {
		for(int cont = 1; cont < frase1.length(); cont++) {
			if(frase1.charAt(cont) != frase2.charAt(cont)) {
				return false;
			}
		}
		
		return true;
	}
	
}
