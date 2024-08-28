package logica.aulas.aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		//LOGICA E (&&)
		//email	senha	login
		
		//true	true	true
		//true	false	false
		//false	true	false
		//false	false	false
		
		boolean verificaEmail = true; 
		boolean verificasenha = true;
		
		boolean logicaE = verificaEmail || verificasenha;
		System.out.println(logicaE);
		
		//LOGICA OU (||)
		//SOL NO DOM	JOGO BR		CHURRASCO
		//true		true	true
		//true		false	true
		//false		 true   true
		//false		false	false
		
		boolean logicaOU = true || false;
		System.out.println(logicaOU);
		
		// Operacao de negacao
		
		boolean negacao =! false;
		System.out.println(negacao);
		
	}

}
