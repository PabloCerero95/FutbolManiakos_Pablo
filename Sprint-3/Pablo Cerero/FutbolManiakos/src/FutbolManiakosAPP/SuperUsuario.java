package FutbolManiakosAPP;

import java.util.ArrayList;

public class SuperUsuario {

	public String nickSuper;
	public String funcion;
	ArrayList<SuperUsuario> superususarios = new ArrayList<SuperUsuario>();

	public SuperUsuario(String nickSuper, String funcion, ArrayList<SuperUsuario> superususarios) {
		super();
		this.nickSuper = nickSuper;
		this.funcion = funcion;
		this.superususarios = superususarios;
	}

	public String getNickSuper() {
		return nickSuper;
	}

	public void setNickSuper(String nickSuper) {
		this.nickSuper = nickSuper;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public ArrayList<SuperUsuario> getSuperususarios() {
		return superususarios;
	}

	public void setSuperususarios(ArrayList<SuperUsuario> superususarios) {
		this.superususarios = superususarios;
	}

	public void MostrarSuperUsuario(ArrayList<SuperUsuario> superususarios) {

	}
	public void ExpulsarUsuario() {
		
	}
}