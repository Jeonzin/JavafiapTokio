package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex8 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais");
		double reais = sc.nextDouble();
		
		System.out.println("valor em reais: " + reais);
		
		double dolarAmericano = reais / 5.64;
		double dolarAmericano2 = reais * 0.18;
		System.out.println("valor em dolar: " + dolarAmericano);
		System.out.println("valor em dolar2: " + dolarAmericano2);
		
		
	}	
}
