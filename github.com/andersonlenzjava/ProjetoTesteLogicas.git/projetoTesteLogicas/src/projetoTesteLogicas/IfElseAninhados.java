package projetoTesteLogicas;

import javax.swing.JOptionPane;

public class IfElseAninhados {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno");

		String mediaAluno = JOptionPane.showInputDialog("Qual a média do aluno");

		double mediaAluno2 = Double.parseDouble(mediaAluno);
		/* converte para int */
		int mediaAluno3 = Integer.parseInt(mediaAluno);

		System.out.println(mediaAluno3);

		if (mediaAluno3 >= 50) {
			if (mediaAluno3 >= 70) {
				if (mediaAluno3 > 90) {
					System.out.println("Aluno está aprovado direto - Parabéns");
				} else {
					System.out.println("Aluno aprovado direto");
				}

			} else {
				System.out.println("Aluno em recuperação");
			}
		} else {
			System.out.println("Aluno reprovado direto");
		}
	}
}
