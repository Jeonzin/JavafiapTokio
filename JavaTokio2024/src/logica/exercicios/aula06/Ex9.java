package logica.exercicios.aula06;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("me informe quantas horas de energia foram utilizadas");
		int energia = sc.nextInt();
		
		System.out.println("Qual o local:");
		System.out.println("[R] [C] [I]");
		char local = sc.next().charAt(0);
		
		switch (local) {
		case 'r': 
			System.out.println("vc tem que pagar: ");
			System.err.println(energia * 0.60);
		break;
		case 'c':
			System.out.println("vc tem que pagar: ");
			System.out.println(energia * 0.48);
		break;
		case 'i':
			System.out.println("vc tem que pagar: ");
			System.out.println(energia * 1.29);
		default:
			System.out.println("digitou errado");
		
		
		
		
	}
  }
}
