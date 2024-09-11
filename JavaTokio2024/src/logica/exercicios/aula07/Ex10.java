package logica.exercicios.aula07;

public class Ex10 {

	public static void main(String[] args) {

		
		
		int numero = 33;
		int divisor = 2;
		
		while (numero % divisor != 0) {
			System.out.printf("%d -- %d | tem resto, logo nao eh divisor\n", numero, divisor);
			divisor++;
		}
		
		if (divisor == numero) {
			System.out.printf("%d eh primo", numero);
		} else {
			System.out.printf("%d nao eh primo", numero);
			System.out.println(divisor);
		}
		
	}

}
