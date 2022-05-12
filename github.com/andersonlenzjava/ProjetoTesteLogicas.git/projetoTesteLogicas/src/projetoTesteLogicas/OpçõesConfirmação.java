package projetoTesteLogicas;

import javax.swing.JOptionPane;

public class OpçõesConfirmação {

	public static void main(String[] args) {
		
		String computadores = JOptionPane.showInputDialog("Informe a quantidade de computadores:");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessas:");
		
		double compNumero = Double.parseDouble(computadores);
		double pessoasNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (compNumero / pessoasNumero);
		
		double resto = compNumero % pessoasNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,"O resutado da divisão é : " + divisao);
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");
		
		//na segunda vez nao precisa declarar a variavel 
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null,"O resto da divisão é : " + divisao);
		}
	}
}
