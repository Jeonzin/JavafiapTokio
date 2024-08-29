package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a nota A: ");
		double notaA = sc.nextDouble();
		
		System.out.println("digite a nota B: ");
		double notaB = sc.nextDouble();
		
		double resultado = notaA + notaB / 2;
		
		System.err.println("sua media e: " + resultado);
	
	}

}
