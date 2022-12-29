package hola.controladores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Pagina5_hacia {
	
	
	private String textoRecibido;

	public String getTextoRecibido() {
		return textoRecibido;
	}

	public void setTextoRecibido(String textoRecibido) {
		this.textoRecibido = textoRecibido;
	}
}
