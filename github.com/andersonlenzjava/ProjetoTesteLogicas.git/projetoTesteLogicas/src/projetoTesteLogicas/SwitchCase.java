package projetoTesteLogicas;

import javax.swing.JOptionPane;

public class SwitchCase {

	public static void main(String[] args) {
		
		String diaEntrada = JOptionPane.showInputDialog("Qual o dia da semana é?");
		
		int dia = Integer.parseInt(diaEntrada);
		
		switch (dia) {
		
		case 1:
			System.out.println("Segunda-Feira");
			break;
		case 2:
			System.out.println("Terça-Feira");
			break;
		case 3:
			System.out.println("Quarta-Feira");
			break;
		case 4:
			System.out.println("Quinta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		
		default: System.out.println("A semana tem 7 dias ");
		}
	}

}
