package logica.exercicios.aula06;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Origem da carga (1-5)");
		int estado = sc.nextInt();
		
		System.out.println("Digite o Peso do caminhao em tonelada: ");
		double pesoToneladas = sc.nextDouble();
		
		System.out.println("Codigo da carga (10-40): ");
		int codCarga = sc.nextInt();
		
		// Realizando os calculos 
		// Convertendo toneladas em kg
		
		double pesoKg = pesoToneladas * 1000;
		
		double precoPorKg = 0;
		
		if (codCarga >= 10 && codCarga <= 20) {
			precoPorKg = 100;
		} else if (codCarga <= 30) {
			precoPorKg = 250;
		} else if (codCarga <= 40) {
			precoPorKg = 340;
		}
		
	
		//estou verificando qual sera a porcentagem do imposto 
		//de  acordo com o estado de origem
		
		double impostoPorcentagem = 0;
		
		if (estado == 1) {
			impostoPorcentagem = 0.35;
		} else if (estado == 2) {
			impostoPorcentagem = 0.25;
		} else if (estado == 3) {
			impostoPorcentagem = 0.15;
		} else if (estado == 4) {
			impostoPorcentagem = 0.05;
		} else if (estado == 5) {
			impostoPorcentagem = 0;
		}
		
		//CALCULAR O PRECO DA CARGA
		double precoCarga = pesoKg * precoPorKg; //1000 * 340  
		
		//CALCULAR O VALOR DO IMPOSTO
		double imposto = precoCarga * impostoPorcentagem; //340.000 * 0.05
		
		//CALCULANDO O VALOR FINAL precocarga + imposto
		double valorfinal = precoCarga + imposto;
		
		System.out.println("Peso da carga em kg: " + pesoKg);
		System.out.println("Preço da carga: " + precoCarga);
		System.out.println("Valor do imposto: " + imposto);
		System.out.println("Valor final: " + valorfinal);

	}
	
	
}
