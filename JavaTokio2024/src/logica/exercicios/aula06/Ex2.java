package logica.exercicios.aula06;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("informe dois numeros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println("number maior: " + n1);
		} else if (n1 == n2) {
			System.out.println("eles são iguais");
		}else {
			System.out.println("number maior: " + n2);			
		}
		
		
		
		
	}

}
