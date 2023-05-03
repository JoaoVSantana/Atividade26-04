package lista;

public class questao8 {
	public static void main(String[] args) {

		for (int cont = 1000; cont < 9999; cont++) {
			if (caracteristica(cont)) {
				System.out.println(cont);
			}
		}
	}

	static boolean caracteristica(int num) {
		
		int soma, mult;
		
		soma = num % 100 + num / 100;
		mult = soma * soma;
		
		return (mult == num);
	}

}
