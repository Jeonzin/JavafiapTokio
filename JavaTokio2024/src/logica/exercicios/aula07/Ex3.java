package logica.exercicios.aula07;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("deseja saber tabuada de qual numero? ");
		int n = sc.nextInt();
		
		for (int i = 0; i <= 30; i++) {
			
			int resultado = n * i;
			System.out.println(n + " X " + i + " = " + resultado);
			 
			
		}
		
		
		
	}

}
