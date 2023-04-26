package lista;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		

	}
	static boolean Nprimos (int numero) {
		
		int marcador = 0;
		int primos = 0;
		
		for(int cont = 1; cont <= numero; cont++) {
			if(numero % cont == 0 ) {
				marcador ++;
			}
		}
		
		if(marcador == 2) {
			primos ++;
			
			return true;
		}
		
		return false;
	}
	
//	static int Imprimir (int numeros) {
//		
//		int divisor = 1;
//		
//		for(int cont = 1; cont <= 100; cont++) {
//			if(divisor % cont == 0 && divisor == cont && divisor != 0  ) {
//			}
//		}
//	}
}
