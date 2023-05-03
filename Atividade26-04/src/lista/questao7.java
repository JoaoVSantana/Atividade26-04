package lista;

public class questao7 {

	public static void main(String[] args) {
		
		for(int cont = 1000; cont < 10000; cont ++) {
			if(palindromo(cont)) {
				System.out.println(cont);
			}
		}

	}
	static boolean palindromo(Integer num) {
		for(int cont = 0; cont < num.toString().length() / 2; cont++) {
			if(num.toString().charAt(cont) != num.toString().charAt(num.toString().length() -1 - cont)) {
				return false;	
			}
		}
		return true;
	}

}
