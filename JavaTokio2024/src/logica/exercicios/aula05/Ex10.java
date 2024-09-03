package logica.exercicios.aula05;

import java.util.Scanner; 

public class Ex10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a quantidade de anos: ");
		int anos = Integer.parseInt(sc.nextLine());
		
		System.out.println("digite a quantidade de meses: ");
		int meses = Integer.parseInt(sc.nextLine());
		
		System.out.println("digite a quantidade de dias: ");
		int dias = Integer.parseInt(sc.nextLine());
		
		int diastotal = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("=====================================");
		System.out.println("quantidade de dias vivido: "+ diastotal);
		
		sc.close();
	}

}