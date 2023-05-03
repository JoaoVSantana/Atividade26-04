package lista;

public class questao6 {

	public static void main(String[] args) {

		for (int i = 1; i < 500; i++) {
			if (nPerfeitos(i)) {
				System.out.println(i);
			}
		}
	}
	static boolean nPerfeitos (int num) {
		int soma = 0;
		
		for(int cont = 1; cont < num; cont++) {
			if(num % cont == 0 ) {
				soma += cont;
			}
		}
		if (soma == num) {
			return true;
		}
		
		return false;
	}

}
