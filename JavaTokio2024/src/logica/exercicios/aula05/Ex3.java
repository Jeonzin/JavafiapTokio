package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("selecione o seu genero da seguinte forma: ");
		System.out.println("[M] Masc");
		System.out.println("[F] Fem");
		System.out.println("[O] Outro");
		System.out.println("[N] N responder");
		
		char generos = sc.nextLine().charAt(0);
	    
		System.out.println("Ola, " + nome + "! vc escolheu a seguinte opcao de genero: " +  generos);
		
	}

}
