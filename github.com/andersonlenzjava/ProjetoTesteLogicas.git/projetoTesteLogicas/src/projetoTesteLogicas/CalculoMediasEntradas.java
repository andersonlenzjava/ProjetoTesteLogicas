package projetoTesteLogicas;

import javax.swing.JOptionPane;

public class CalculoMediasEntradas {

	public static void main(String[] args) {

		String nota1E = JOptionPane.showInputDialog("Qual a nota 1:");
		String nota2E = JOptionPane.showInputDialog("Qual a nota 2:");
		String nota3E = JOptionPane.showInputDialog("Qual a nota 3:");
		String nota4E = JOptionPane.showInputDialog("Qual a nota 4:");

		double nota1 = Double.parseDouble(nota1E);
		double nota2 = Double.parseDouble(nota2E);
		double nota3 = Double.parseDouble(nota3E);
		double nota4 = Double.parseDouble(nota4E);

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Você passou direto - parabéns. Media = " + media);
				} else {
					System.out.println("Você passou direto. Media = " + media);
				}
			} else {
				System.out.println("Você está de recuperação. Media = " + media);
			}
		} else {
			System.out.println("Você está reprovado. Media = " + media);
		}
	}

}
