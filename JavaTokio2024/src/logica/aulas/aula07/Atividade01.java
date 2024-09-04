package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, soma = 0;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		soma = soma + numero;
		
		System.out.println("digite um numero: ");
		numero = sc.nextInt();
		soma += numero; // soma = soma + numero
		
		System.out.println("digite um numero: ");
		numero = sc.nextInt();
		soma += numero; // soma = soma + numero
		
		System.out.println("A soma é: " + soma);
		
	}

}
