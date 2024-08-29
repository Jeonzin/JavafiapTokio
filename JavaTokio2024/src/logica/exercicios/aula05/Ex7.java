package logica.exercicios.aula05;

import java.util.Scanner; 

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("qual o valor do produto? ");
		float valor = Float.parseFloat(sc.nextLine());
		
		System.out.println("digite o valor ja pago");
		float pago = Float.parseFloat(sc.nextLine());
		
		float troco = valor - pago;
		
		System.out.println("o troco foi: " + troco);
		
		
		
	}
	
}
