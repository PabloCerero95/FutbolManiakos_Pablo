package FutbolManiakosAPP;

public class Usuario {

	public String nombreUsuario;
	private String password;
	private String correoelectronico;

	public Usuario(String nombreUsuario, String password, String correoelectronico) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.correoelectronico = correoelectronico;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public void IniciarSesion(String nombreUsuario, String correoelectronico) {

	}

	public void RecuperarClave(String correoelectronico) {

	}
}
