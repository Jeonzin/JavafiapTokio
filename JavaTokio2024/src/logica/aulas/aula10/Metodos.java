package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos {
	
	//METODOS SEM RETORNO E SEM PARAMETROS/ARGUMENTOS
	
	//DECLARACAO DA FUNCAO
	static void saudacao() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Seja bem-vindo, " + nome);
	}

	public static void main(String[] args) {	

		//chamada da função
		saudacao();
		
		System.out.println();
		
	}
}
