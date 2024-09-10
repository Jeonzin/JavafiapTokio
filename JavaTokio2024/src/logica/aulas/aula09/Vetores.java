package logica.aulas.aula09;

public class Vetores {

	public static void main(String[] args) {

		//Lado esquerdo: declaracao do vetor de num inteiro
		//lado direito: instanciamos o vetor com 10 posicoes
		int[] vetorInteiro = new int[10];
		
		vetorInteiro[0] = 10; //colocando o valor 10 na posicao 0 do vetor
		vetorInteiro[1] = 1999; //colocando o valor 1999 na posicao 1 do vetor
		
		System.out.println("Valor inteiro na posicao 0: " + vetorInteiro[0]);
		
		int anoNascimento = vetorInteiro[1];
		System.out.println("Ano nascimento: " + anoNascimento);
		
		// acessando a posicao via variavel
		int posicao = 0;
		System.out.println(vetorInteiro[posicao]);
		
		System.out.println("---------------------------------------");
		//--------------------------------------------------------------
		
		// DECLARANDO UMA LISTA DE FRUTAS COM 4 POSICOES
		
		String[] listaFrutas = new String[4];
		
		listaFrutas[0] = "Morango";
		listaFrutas[1] = "Uva";
		listaFrutas[2] = "Pera";
		listaFrutas[3] = "Tomate";
		
		System.out.println("Fruta pos 1: " + listaFrutas[1]);

		// OUTRO JEITO DE DECLARAR LISTAS!!!
		String[] listaFruta2 = {"Melancia", "Abacaxi", "Pitaia", "Banana", "Jaca"};
		
		//listaFruta[0] = "Melancia"
		//listaFruta[1] = "Abacaxi"
		//listaFruta[2] = "Pitaia"
		//listaFruta[3] = "Banana"
		//listaFruta.length = 4
		
		int qtdFrutas = listaFruta2.length;
		System.out.println("Qtd de frutas: " + qtdFrutas);
		
		//FOR INDEXADO
		for (int i = 0; i < listaFruta2.length; i++) {
			System.out.println(listaFruta2[i]);
		}
		
		//CRIAR UMA LISTA DE NUMERO
		
		int[] numeros = {16, 24, 29, 33};
		
		//FOR EACH --> percorre a lista e acessa os valores das posicoes
		
		System.out.println();
		
		for (int numero: numeros) {
			
		}
		
		
		
		
	}
}
