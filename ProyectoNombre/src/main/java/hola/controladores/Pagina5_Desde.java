package hola.controladores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class Pagina5_Desde {

	private String textoEnviar;

	public String getTextoEnviar() {
		return textoEnviar;
	}

	public void setTextoEnviar(String textoEnviar) {
		this.textoEnviar = textoEnviar;
	}
	
	public void transferirInformacion() {
		FacesContext contexto = FacesContext.getCurrentInstance();
		
		Pagina5_hacia e = (Pagina5_hacia) contexto.getApplication() .evaluateExpressionGet(contexto, "#{pagina5_hacia}", Pagina5_hacia.class);
		e.setTextoRecibido(textoEnviar);
		
	}
}
