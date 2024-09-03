package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um numero entre 0 e 100: ");
		int number = sc.nextInt();
		
		int centena = (number / 100) * 100;
		int dezena = ((number % 100) / 10) * 10;
		int unidade = number % 10;
		
		System.out.println("==========================");
		System.out.println("centena: " + centena);
		System.out.println("dezena: " + dezena);
		System.out.println("unidade: " + unidade);
	}
}
