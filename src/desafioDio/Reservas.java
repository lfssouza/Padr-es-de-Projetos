package desafioDio;

import Cliente.Service;
import Destino.Lugar;

public class Reservas {
	
	public Reservas() {
	}
	
	public void iniciarReservas(String lugar) {
		String cliente = Lugar.getLugar().recuperarCliente(lugar);
		
		Service.fazerReserva(cliente, lugar);
		
	}
}
