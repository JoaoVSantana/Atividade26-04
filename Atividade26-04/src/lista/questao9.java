package lista;

import java.util.Scanner;

public class questao9 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int num1, num2;
		
		for(int cont = 0; cont < 10; cont ++) {
			System.out.println("Digite o primeiro número inteiro positivo:");
			num1 = leia.nextInt();
			
			System.out.println("Digite o segundo número inteiro positivo:");
			num2 = leia.nextInt();
			
			System.out.println("O resultado é " + conta(num1, num2) + "\n");
		}
		leia.close();
	}

	static int conta (int num1,int num2) {
		
		int resultado = 0;
		
		if (num1 % 2 == 1) {
			resultado = num2;
		}
		
		while (num1 > 1) {
			num1 = num1 / 2;
			num2 = num2 * 2;				
			
			if (num1 % 2 == 1) {
				resultado += num2;
			
			}
		}
		
		return resultado;
	}
}
