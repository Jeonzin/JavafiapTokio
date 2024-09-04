package logica.exercicios.aula06;

import java.time.Year;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int anoatual = Year.now().getValue();
		
		System.out.println("Qual seu ano de nascimento: ");
		
		int anonasc = sc.nextInt();
		int idade = anoatual - anonasc;
		
		if (idade >= 18 && idade <= 70) {
			System.out.println("Seu voto e obrigatorio");
		} else if (idade >= 16 && idade < 18 || idade > 70) {
			System.out.println("Seu voto e opcional");
		} else {
			System.out.println("Seu voto e proibido");
		}
		
		sc.close();
	}

}
