package lista;

import java.util.Scanner;

public class questao10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double peso, altura, imc;
		
		System.out.println("Ola! Iremos calcular seu IMC\n");
		
		System.out.println("Digite seu peso:");
		peso = leia.nextDouble();
		
		System.out.println("\nDigite sua altura: ");
		altura = leia.nextDouble();
		
		imc = calculo(peso,altura);
		
		System.out.println("\nSeu IMC é de " + imc + "\n");
		
		if(imc < 20) {
			System.out.println("Sua situação corporórea é de um corpo magro");
			
		} else if (imc >= 20 && imc <= 24) {
			System.out.println("Sua situação corporórea é de um corpo normal");
			
		} else if (imc >= 25 && imc <= 29) {
			System.out.println("Sua situação corporórea é de um corpo acima do peso");
			
		} else if (imc >= 30 && imc <= 34) {
			System.out.println("Sua situação corporórea é de um corpo obeso");
			
		} else {
			System.out.println("Sua situação corporórea é de um corpo muito obeso");
		}
		
		leia.close();
	}
	static double calculo (double peso, double altura) {
		return peso / (altura * altura);
	}

}
