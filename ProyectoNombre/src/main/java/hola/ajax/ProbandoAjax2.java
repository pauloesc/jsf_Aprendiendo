package hola.ajax;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean
@RequestScoped
public class ProbandoAjax2 {

	private String codigoPais;
	private String codCiudad;
	private String nombre;
	private List<String> listaCiudades = new ArrayList<String>();
	
	
	public String getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}
	public String getCodCiudad() {
		return codCiudad;
	}
	public void setCodCiudad(String codCiudad) {
		this.codCiudad = codCiudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<String> getListaCiudades() {
		return listaCiudades;
	}
	public void setListaCiudades(List<String> listaCiudades) {
		this.listaCiudades = listaCiudades;
	}

	//AjaxBehaviorEvent se utiliza para indicar que esta funcion va a soporta algun comportamiento ajax
	public void cargarCiudades( AjaxBehaviorEvent event ) {
		
		switch(codigoPais){
		
		case "1":
			this.listaCiudades.add("LIMA");
			this.listaCiudades.add("CUZCO");
			break;
			
		case "2":
			this.listaCiudades.add("BOGOTA");
			this.listaCiudades.add("CALI");
			break;
			
		}
		
		
	}
	
}
