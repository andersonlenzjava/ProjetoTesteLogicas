package projetoTesteLogicas;

import javax.swing.JOptionPane;

public class IfElseAninhados {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno");

		String mediaAluno = JOptionPane.showInputDialog("Qual a m�dia do aluno");

		double mediaAluno2 = Double.parseDouble(mediaAluno);
		
		System.out.println(mediaAluno2);

		if (mediaAluno2 >= 50) {
			if (mediaAluno2 >= 70) {
				if (mediaAluno2 > 90) {
					System.out.println("Aluno est� aprovado direto - Parab�ns. Nota = " + mediaAluno2);
				} else {
					System.out.println("Aluno aprovado direto. Nota = " + mediaAluno2);
				}

			} else {
				System.out.println("Aluno em recupera��o. Nota = " + mediaAluno2);
			}
		} else {
			System.out.println("Aluno reprovado direto. Nota = " + mediaAluno2);
		}
	}
}
