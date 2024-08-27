package logica.exercicios.aula04;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("me informe seu nome e sua idade");
		String nome = sc.nextLine();
		int idade = sc.nextInt();
		
		System.out.println("Olá, " + nome + " Você tem " + idade + " anos.");
		
		
	}
}
