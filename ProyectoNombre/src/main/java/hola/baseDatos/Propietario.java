package hola.baseDatos;

import java.util.ArrayList;
import java.util.List;

public class Propietario {

	private String nombre;
	private String apellido;
	private List<Casa> casas = new ArrayList<Casa>();
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public List<Casa> getCasas() {
		return casas;
	}
	public void setCasas(List<Casa> casas) {
		this.casas = casas;
	}
	
}
