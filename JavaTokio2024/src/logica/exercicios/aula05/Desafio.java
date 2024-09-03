package logica.exercicios.aula05;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a quantidade de dias pra saber sua idade: ");
		int totaldias = Integer.parseInt(sc.nextLine());
		
		int anos = (totaldias / 365);
		int meses = (totaldias % 365) / 30;
		int dias = (totaldias % 365) % 30;
		
		System.out.println("vc tem viveu todos esses dias: ");
		System.out.println("anos: " + anos);
		System.out.println("meses: " + meses);
		System.out.println("dias: " + dias);
		
		sc.close();
		
	}
	
}
