package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
	    System.out.println("digite as duas nota do aluno");
		double notaA = sc.nextDouble();
		double notaB = sc.nextDouble();
		double mediapon = (notaA * 0.4) + (notaB * 0.6);
		
		System.out.println("essa é a sua media ponderada: " + mediapon);
		
		
	}

}
