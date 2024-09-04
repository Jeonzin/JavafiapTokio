package logica.exercicios.aula06;

import java.awt.SystemColor;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		double n1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite o segundo numero: ");
		double n2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Digite qual operacao deseja utilizar");
		System.out.println("[+] [-] [*] [/]");
		char operacao = sc.nextLine().charAt(0); 

		switch (operacao) {
			case '+': 
				System.out.println("Resultado da operacao: ");
				System.out.println(n1 + n2);
			break;
			case '-':
				System.out.println("Resultado da operacao: ");
				System.out.println(n1 - n2);
			break;
			case '*':
				System.out.println("Resultado da operacao");
				System.out.println(n1 * n2);
		    break;
			case '/':
				System.out.println("Resultado da operacao");
				System.out.println(n1 / n2);
		    break;
		 default:
			 System.err.println("Operacao digitada Invalida");
			 
			sc.close();
		}
	}

}
