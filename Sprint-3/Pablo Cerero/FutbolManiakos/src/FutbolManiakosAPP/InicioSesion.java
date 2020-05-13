package FutbolManiakosAPP;

public class InicioSesion {

	public String nombreUsario;
	private String password;
	private String correoelectronico;

	public InicioSesion(String nombre, String password, String correoelectronico) {
		super();
		this.nombreUsario = nombre;
		this.password = password;
		this.correoelectronico = correoelectronico;
	}

	public String getNombre() {
		return nombreUsario;
	}

	public void setNombre(String nombre) {
		this.nombreUsario = nombre;
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

	public void IniciarSesion(String nombreUsuario, String correoElectronica) {

	}

	private void RecuperarUsuario(String CorreoElectronico) {
	}

}
