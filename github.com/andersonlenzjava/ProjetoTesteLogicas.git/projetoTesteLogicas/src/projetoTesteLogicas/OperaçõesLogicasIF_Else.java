package projetoTesteLogicas;

import javax.swing.JOptionPane;

public class Opera��esLogicasIF_Else {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno");

		String mediaAluno = JOptionPane.showInputDialog("Qual a m�dia do aluno");

		double mediaAluno2 = Double.parseDouble(mediaAluno);
		/* converte para int*/

		if (mediaAluno2 >= 70 && nome.equals("Anderson")) {
			System.out.println("Parab�ns voc� est� aprovado");

		} else if (mediaAluno2 < 70 && nome.equals("Anderson")) {
			System.out.println("Aluno voc� est� reprovado");

		} else {
			System.out.println("Aluno n�o encontrado");
		}

	}

}
