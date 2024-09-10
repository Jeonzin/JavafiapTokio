package logica.aulas.aula09;

public class Matrizes {

	public static void main(String[] args) {

		//TABULEIRO DO JOGO DA VELHA
		
		char[][] tabuleiro = new char [3][3];
		
		tabuleiro [0][0] = 'X';
		tabuleiro [1][1] = 'O';
		tabuleiro [2][2] = 'X';
		
		
		// criando mais algumas matrizes 
		
		int [][] matriz = new int [4][5];
		
		int linhas = matriz.length; //quantidade de linhas
		System.out.println(linhas);
		
		int colunas = matriz[0].length; // quantidade de coluna
		System.out.println(colunas);
		
		int numero = 1;
		
		System.out.println();

		//FOR PARA INCLUIR VALORES NA MATRIZ
		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = numero;
				numero++;
			}
		}

		// FOR PARA EXIBIR A MATRIZ
		for (int i = 0; i < linhas; i++) {

			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
