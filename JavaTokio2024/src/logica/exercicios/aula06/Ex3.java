package logica.exercicios.aula06;

public class Ex3 {

	public static void main(String[] args) {
	
		int n1 = 4;
		int n2 = 4;
		int n3 = 4;
		int n4 = 4;
		int media = (n1 + n2 + n3 + n4) / 4;
				
		if (media >= 8) {
			System.out.println("Aprovado");
		} else if (media >= 5 && media < 7){
			System.out.println("Recuperacao");
		} else {
			System.out.println("Reprovado");
		}
		
		System.err.println(media);
	
	}

}
