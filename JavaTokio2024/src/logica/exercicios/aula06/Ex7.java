package logica.exercicios.aula06;

public class Ex7 {

	public static void main(String[] args) {

		int a = 5, b = 7, c = 4, d = 8;
		
		if ( (a <= b) && (b < d) ){
			System.out.println("verdadeiro");			
		} else {
			System.out.println("falso");
		}
		
		if ( (a == b) || (c != b) ) {
			System.out.println("verdadeiro");
		} else {
			System.out.println("falso");
		}
		
		if ((d > a) && (c >= b) ) {
			System.out.println("verdadeiro");
		} else {
			System.out.println("falso");
		}
		
		if ( (a <= b) || (c <= d) ) {
			System.out.println("verdadeiro");
		} else {
			System.out.println("falso");
		}
		
		if ( (b > c) || (c < a) && (d <= b) ) {
			System.out.println("verdadeiro");
		} else {
			System.out.println("falso");
		}
		
		
	}

}
