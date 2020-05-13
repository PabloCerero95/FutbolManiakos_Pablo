package FutbolManiakosAPP;

import java.util.ArrayList;

public class Mensajes {

	public String nickDestinatario;
	public String[] MensajesTotal;
	ArrayList<Mensajes> mensajes = new ArrayList<Mensajes>();


	public Mensajes(String nickDestinatario, String[] mensajesTotal, ArrayList<Mensajes> mensajes) {
		super();
		this.nickDestinatario = nickDestinatario;
		MensajesTotal = mensajesTotal;
		this.mensajes = mensajes;
	}
	
	public String getNickDestinatario() {
		return nickDestinatario;
	}

	public void setNickDestinatario(String nickDestinatario) {
		this.nickDestinatario = nickDestinatario;
	}

	public String[] getMensajesTotal() {
		return MensajesTotal;
	}

	public void setMensajesTotal(String[] mensajesTotal) {
		MensajesTotal = mensajesTotal;
	}

	public ArrayList<Mensajes> getMensajes() {
		return mensajes;
	}

	public void setMensajes(ArrayList<Mensajes> mensajes) {
		this.mensajes = mensajes;
	}

	public void EnviarMensaje(String nickDestinatario, String[] Mensajes) {

	}
	public void MensajesAnteriores(ArrayList<Mensajes> mensajes) {
		
	}
}
