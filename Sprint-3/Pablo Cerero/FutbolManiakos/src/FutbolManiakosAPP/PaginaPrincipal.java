package FutbolManiakosAPP;

import java.util.ArrayList;

public class PaginaPrincipal<Noticias> {

	String noticia;
	ArrayList<Noticias> noticias = new ArrayList<Noticias>();
	
	public PaginaPrincipal(String noticia, ArrayList<Noticias> noticias) {
		super();
		this.noticia = noticia;
		this.noticias = noticias;
	}

	public String getNoticia() {
		return noticia;
	}

	public void setNoticia(String noticia) {
		this.noticia = noticia;
	}

	public ArrayList<Noticias> getNoticias() {
		return noticias;
	}

	public void setNoticias(ArrayList<Noticias> noticias) {
		this.noticias = noticias;
	}
	
	public void MostrarNoticias(ArrayList<Noticias> noticias) {
		
	}
	
}
