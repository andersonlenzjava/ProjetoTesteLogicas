package projetoTesteLogicas;

import javax.swing.JOptionPane;

public class IfElseAninhados {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno");

		String mediaAluno = JOptionPane.showInputDialog("Qual a média do aluno");

		double mediaAluno2 = Double.parseDouble(mediaAluno);
		
		System.out.println(mediaAluno2);

		if (mediaAluno2 >= 50) {
			if (mediaAluno2 >= 70) {
				if (mediaAluno2 > 90) {
					System.out.println("Aluno está aprovado direto - Parabéns. Nota = " + mediaAluno2);
				} else {
					System.out.println("Aluno aprovado direto. Nota = " + mediaAluno2);
				}

			} else {
				System.out.println("Aluno em recuperação. Nota = " + mediaAluno2);
			}
		} else {
			System.out.println("Aluno reprovado direto. Nota = " + mediaAluno2);
		}
	}
}
