package projetoTesteLogicas;

import javax.swing.JOptionPane;

public class Op��esConfirma��o {

	public static void main(String[] args) {
		
		String computadores = JOptionPane.showInputDialog("Informe a quantidade de computadores:");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessas:");
		
		double compNumero = Double.parseDouble(computadores);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (compNumero / pessoasNumero);
		
		double resto = compNumero % pessoasNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,"O resutado da divis�o � : " + divisao);
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divis�o?");
		
		//na segunda vez nao precisa declarar a variavel 
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,"O resto da divis�o � : " + divisao);
		}
	}
}
