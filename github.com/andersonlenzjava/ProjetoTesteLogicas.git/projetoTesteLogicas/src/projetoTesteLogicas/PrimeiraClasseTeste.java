package projetoTesteLogicas;

public class PrimeiraClasseTeste {
	
	static int variavelGlobalUm = 25;
	
	public static void main(String[] args) {
		
	
	int maiorIdade = 18;
	System.out.println("Valor variavel local = " + maiorIdade);
	metodo2();
		
	}

	public static void metodo2 () {
		System.out.println("Valor da varável Global = " + variavelGlobalUm);
	}
}
