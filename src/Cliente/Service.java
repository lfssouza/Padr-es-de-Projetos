package Cliente;

public class Service {
	
	private Service(){
		super();
	}
	public static void fazerReserva(String nome, String destino) {
		System.out.println("Reserva realizada!");
		System.out.println(nome);
		System.out.println(destino);
	}
	
}
