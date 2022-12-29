package hola.ajax;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ProbandoAjax1 {

	private String informacion;
	private String informacion2;
	

	public String getInformacion2() {
		return informacion2;
	}

	public void setInformacion2(String informacion2) {
		this.informacion2 = informacion2;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
	
}
