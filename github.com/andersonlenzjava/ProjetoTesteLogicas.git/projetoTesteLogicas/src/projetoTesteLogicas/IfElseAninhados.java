package projetoTesteLogicas;

import javax.swing.JOptionPane;

public class IfElseAninhados {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno");

		String mediaAluno = JOptionPane.showInputDialog("Qual a m�dia do aluno");

		double mediaAluno2 = Double.parseDouble(mediaAluno);
		/* converte para int */
		int mediaAluno3 = Integer.parseInt(mediaAluno);

		System.out.println(mediaAluno3);

		if (mediaAluno3 >= 50) {
			if (mediaAluno3 >= 70) {
				if (mediaAluno3 > 90) {
					System.out.println("Aluno est� aprovado direto - Parab�ns");
				} else {
					System.out.println("Aluno aprovado direto");
				}

			} else {
				System.out.println("Aluno em recupera��o");
			}
		} else {
			System.out.println("Aluno reprovado direto");
		}
	}
}
