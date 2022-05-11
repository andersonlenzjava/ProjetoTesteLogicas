package projetoTesteLogicas;

public class ExemploVariavelGlobal {

	static int maiorIdadeGlobal = 25;

	public static void main(String[] args) {

	int maiorIdade = 18;
	System.out.println("Valor variavel local = " + maiorIdade);
		
	metodo2 ();
	
	}
	
	public static void metodo2 () {
		System.out.println("Valor da variável Global = " + maiorIdadeGlobal);
	}
}
