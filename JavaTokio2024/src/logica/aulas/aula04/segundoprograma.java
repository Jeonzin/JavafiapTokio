package logica.aulas.aula04;

import java.util.Scanner;

public class segundoprograma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine(); 
		
		System.out.println("Hello, " + nome);
		System.out.println("sua idade é: " + sc.nextInt());
		
		sc.close();
	}
}
