package logica.exercicios.aula07;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		String mesage = "denovo";
		Scanner sc = new Scanner(System.in);
		
		
		while (mesage.equals("denovo")) {
			System.out.println("salve mano");
			
			System.out.println("digite denovo para repetir");
			mesage = sc.nextLine();
		}
		System.out.println("ate mais");
	}

}
