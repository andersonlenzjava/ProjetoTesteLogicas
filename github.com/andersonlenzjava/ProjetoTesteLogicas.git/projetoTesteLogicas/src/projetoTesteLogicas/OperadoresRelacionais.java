package projetoTesteLogicas;

import javax.swing.JOptionPane;

public class OperadoresRelacionais {

	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Qual a nota1");
		int nota1I = Integer.parseInt(nota1);

		String nota2 = JOptionPane.showInputDialog("Qual a nota2");
		int nota2I = Integer.parseInt(nota2);

		String nota3 = JOptionPane.showInputDialog("Qual a nota3");
		int nota3I = Integer.parseInt(nota3);

		String nota4 = JOptionPane.showInputDialog("Qual a nota4");
		int nota4I = Integer.parseInt(nota4);
		
		System.out.println(" nota 1 = " + nota1I + "\n nota 2 = "  + nota2I + "\n nota 3 = " + nota3I + "\n nota 4 = " + nota4I);

		if (nota1I == nota2I) {
			System.out.println("As notas 1 e 2 s�o iguais (VF1)");
		} else {
			System.out.println("As notas 1 e 2 s�o diferentes (VF1)");
		}

		if (nota1I != nota2I) {
			System.out.println("As notas 1 e 2 s�o diferentes (VF2)");
		} else {
			System.out.println("As notas 1 e 2 s�o iguais (VF2)");
		}

		if (nota3I > nota4I) {
			System.out.println("A nota 3 � maior que a nota 4");
		} else if (nota3I == nota4I) {
			System.out.println("As notas 3 e 4 s�o iguais");
		} else {
			System.out.println("A nota 4 � maior que a nota 4");
		}

	}

}
