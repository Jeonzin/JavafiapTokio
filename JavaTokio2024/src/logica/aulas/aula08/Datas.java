package logica.aulas.aula08;

import java.util.Calendar;

public class Datas {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		System.out.println("Data e hora atual: " + c.getTime());
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("mes: " + c.get(Calendar.MONTH));
		System.out.println("dia do mes: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("dia da semana: " + c.get(Calendar.DAY_OF_WEEK));
		
	}

}
