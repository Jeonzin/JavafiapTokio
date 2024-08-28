package logica.aulas.aula05;

public class Operadores {

	public static void main(String[] args) {

		float num1 = 5f;
		float num2 = 2f;
		
		System.out.println(num1);
		System.out.println(num2);
		
		float soma = num1 + num2;
		System.out.println("soma: " + soma);
		
		float subtracao = num1 - num2;
		System.out.println("sub:" + subtracao);
		
		float multiplicacao = num1 * num2;
		System.out.println("mult: " + multiplicacao);
		
		float divisao = num1 / num2;
		System.out.println("divisao: " + divisao);

		float resto = num1 % num2;
		System.out.println("resto: " + resto);
		
		System.out.println(" ");
		
		/*Operadores unarios
		 * ++ incrementa 1
		 * -- decremento 1
		
		
		
		*/
		System.out.println("testando os operadores unarios: ");
		int numero = 15;
		System.out.println(numero);
		
		numero++;
		System.out.println(numero);
		System.out.println(numero++);
		System.out.println(numero);
		System.out.println(++numero);
		
		System.out.println(numero + 1);
		System.out.println(numero);
		
		numero--;
		System.out.println(numero);
		
		//Operadores de atribuição
		System.out.println(" ");
		System.out.println("testando operadores de atribuicao: ");
		int number = 5;
		
		//usar double pode ser melhor pq pode utilizar numero decimal
		
		System.out.println(" ");
		System.out.println(number);
		
		//number = number + 7;
		number += 7;
		System.out.println(number);
		
		number /= 2;
		System.out.println(number);
		
		
		
		
		
	
	}

}
