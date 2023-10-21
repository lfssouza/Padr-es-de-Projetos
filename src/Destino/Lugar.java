package Destino;

public class Lugar {
	
	private static Lugar lugar = new Lugar();
	
	private Lugar() {
		super();
	}
	
	public static Lugar getLugar() {
		return lugar;
	}
	
	public String recuperarCliente(String nome) {
		return "Luis";
	}
}
