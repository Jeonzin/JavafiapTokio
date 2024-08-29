package logica.exercicios.aula05;

import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args) {
	
		//peça 1
		Scanner sc = new Scanner(System.in);
		
		System.out.println("deseja qual peca? ");
		String nomeP = sc.nextLine();
		System.out.println("deseja quantas(os) " + nomeP);
		
		int peca1 = Integer.parseInt(sc.nextLine());
		double valor0 = 5.00;
		System.out.println("valor unitario da peca " + valor0);
		System.out.println(peca1 + " esta saindo por R$" + valor0 * peca1);
		
		//peça 2
		System.out.println(" ");
		
		double valor1 = 10.00;
		System.out.println("qual a segunda peca vc deseja? ");
		String nomeP1 = sc.nextLine();
		
		System.out.println("deseja quantas(os) " + nomeP1);
		int peca2 = Integer.parseInt(sc.nextLine());
		
		System.out.println("valor unitario da peca " + valor1);
		System.out.println(peca2 + " esta saindo por R$" + valor1 * peca2);
		
		System.out.println(" ");
		
		double total = (valor0 * peca1) + (valor1 * peca2);
		System.out.println("tudo esta saindo por R$ " + total);
		
		
		
	}

}
