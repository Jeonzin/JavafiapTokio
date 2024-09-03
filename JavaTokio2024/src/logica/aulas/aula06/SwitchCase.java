package logica.aulas.aula06;

public class SwitchCase {

	public static void main(String[] args) {
		
		int tipoUsuario = 0;
		
		//tipoUsuarui = 0 é admin
		//tipoUsuario = 1 é cliente
		
		switch (tipoUsuario) {
			case 0:
				System.out.println("Usuario ADM");
				break;
			case 1:
				System.out.println("Usuario cliente");
				break;
			default:
				System.out.println("Erro");
				
		}

	}

}
