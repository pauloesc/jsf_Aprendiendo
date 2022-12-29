package hola.controladores;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@SessionScoped
public class Pagina4Controlador {
	private String localidad;
	private static Map<String, Object> listaPaises;
	
	static {
		listaPaises = new HashMap<String, Object>();
		listaPaises.put("Ingles", Locale.ENGLISH );
		listaPaises.put("Frances", Locale.FRANCE);
		listaPaises.put("Español", new Locale("es") );
	}
	
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public Map<String, Object> getListaPaises() {
		return listaPaises;
	}
	public void setListaPaises(Map<String, Object> listaPaises) {
		Pagina4Controlador.listaPaises = listaPaises;
	}
	
	public void localidadCambiando( ValueChangeEvent ev ) {
		String IdiomaSeleccionado = ev.getNewValue().toString();
 
		for( Map.Entry<String , Object> e : listaPaises.entrySet()  ){
			if( e.getValue().toString().equals(IdiomaSeleccionado) ) {
				FacesContext.getCurrentInstance().getViewRoot().setLocale( (Locale) e.getValue() );
			}
		}
		//FacesContext.getCurrentInstance().getViewRoot().setLocale( Locale.FRENCH );
		//FacesContext.getCurrentInstance().getViewRoot().setLocale( (Locale) listaPaises.get(IdiomaSeleccionado) );
		

	}
	
}
