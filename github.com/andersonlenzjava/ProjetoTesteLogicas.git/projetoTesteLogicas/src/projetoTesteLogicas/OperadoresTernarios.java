package projetoTesteLogicas;

import javax.swing.JOptionPane;

public class OperadoresTernarios {

	public static void main(String[] args) {

		//String nome = JOptionPane.showInputDialog("Qual o nome do aluno");

		String mediaAluno = JOptionPane.showInputDialog("Qual a m�dia do aluno");

		double mediaAluno2 = Double.parseDouble(mediaAluno);
		/* converte para int */
		int mediaAluno3 = Integer.parseInt(mediaAluno);

		System.out.println(mediaAluno3);

		String saidaResultado = mediaAluno3 >= 70 ? "aluno aprovado" : "Aluno Reprovado";
		System.out.println("Condi��o 1 " + saidaResultado);
		
		String saidaResultado2 = mediaAluno3 >= 70 ? "Aluno Aprovado" : (mediaAluno3 >= 40 && mediaAluno3 <= 69 ? "Aluno em recupera��o" : "Aluno Reprovado");
		System.out.println("Condi��o 2 " + saidaResultado2);
		
	}
}
