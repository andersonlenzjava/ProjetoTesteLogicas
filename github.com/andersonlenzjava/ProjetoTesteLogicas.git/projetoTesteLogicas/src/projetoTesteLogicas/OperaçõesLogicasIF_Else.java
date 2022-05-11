package projetoTesteLogicas;

import javax.swing.JOptionPane;

public class OperaçõesLogicasIF_Else {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno");

		String mediaAluno = JOptionPane.showInputDialog("Qual a média do aluno");

		double mediaAluno2 = Double.parseDouble(mediaAluno);
		/* converte para int*/
		int mediaAluno3 = Integer.parseInt(mediaAluno);
		
		System.out.println(mediaAluno3);
		
		if (mediaAluno2 >= 70 && nome.equals("Anderson")) {
			System.out.println("Parabéns você está aprovado");

		} else if (mediaAluno2 < 70 && nome.equals("Anderson")) {
			System.out.println("Aluno você está reprovado");

		} else {
			System.out.println("Aluno não encontrado");
		}

	}

}
