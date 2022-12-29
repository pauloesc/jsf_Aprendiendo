package hola.controladores;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "pagina2Bean" )
public class Pagina2Bean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String mensaje = "mensaje con jsf";
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void saludar() {
		this.mensaje = "Hola, tu nombre es: "+this.nombre;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}
