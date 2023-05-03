package lista;

public class questao5 {

	public static void main(String[] args) {
		
		for (int i = 10; i < 100; i++ ) {
			if (verPrimos(i)) {
				System.out.println(i);
			}
		}		

	}
	static boolean verPrimos (int numero) {
		
		int marcador = 0;
		
		for(int cont = 1; cont <= numero; cont++) {
			if(numero % cont == 0 ) {
				marcador ++;
			}
			if(marcador > 2) {		
				return false;
			}
		}
		return true;
	}
}
