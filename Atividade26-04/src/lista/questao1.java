package lista;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String caracter;
		boolean confirma = false;
		
		System.out.println("Digite um carácter: ");
		caracter = leia.next();
		
		confirma = verificacao(caracter);
		if(confirma) {
			System.out.println("Todos os caracteres são minúsculos");
			
		} else {
			System.out.println("Nem todos os caracteres são minúsculos");
		}
		
		leia.close();
	}
	
	static boolean verificacao(String caracter) {
		if(caracter.matches("[a-z]*")) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
}