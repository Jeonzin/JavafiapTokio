package logica.aulas.aula06;

public class Condicionais {

	public static void main(String[] args) {

		// -------------------------------
		// ESTRUTURA CONDICIONAIS SIMPLES
		// -------------------------------
		/*
		float nota = 7;

		if (nota > 6) {
			System.out.println("sua nota é: " + nota);
		} else {
			System.out.println("repetiu de ano");
		}

		System.out.println("FIM");
		*/
		
		// -------------------------------
		// ESTRUTURA CONDICIONAIS ENCADEADA
		// -------------------------------
		/*
		float notafinal = 10;

		if (notafinal < 4) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Vamos Ver...");
			
			if(notafinal < 6) {
				System.out.println("Recuperacao");
			} else {
				System.out.println("Aprovado");
			}
           
		}
         */
		
		//-------------------------------
		// ESTRUTURA CONDICIONAIS COMPOSTA
		//-------------------------------
		/*
		float notafinal = 10;
		
		if (notafinal > 5) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		*/
		
		//----------------------------------
		// ESTRUTURA CONDICIONAL COMPOSTA V2
		//----------------------------------
		
		float notafinal = 10;
		
		if (notafinal < 4) {
			System.out.println("Reprovado");
		} else if (notafinal < 6) {
			System.out.println("Recuperacao");
		} else {
			System.out.println("Aprovado");
		}
		
		
	}

}
