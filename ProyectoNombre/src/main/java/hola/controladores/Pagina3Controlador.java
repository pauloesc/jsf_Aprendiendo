package hola.controladores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

import hola.baseDatos.Persona;

@ManagedBean()
public class Pagina3Controlador {
	
	private Persona Persona = new Persona();
	private static List<Persona> listaPersonas = new ArrayList<Persona>();
	private List<String> OjosColores = new ArrayList<String>();
	
	public Pagina3Controlador() {
		OjosColores = Arrays.asList(
				"verde","verdes",
				"azul","azules",
				"marron","marrones",
				"negro","negros");
	}
	
	public Persona getPersona() {
		return Persona;
	}
	public void setPersona(Persona persona) {
		Persona = persona;
	}
	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}
	public void setListaPersonas(List<Persona> listaPersonas) {
		Pagina3Controlador.listaPersonas = listaPersonas;
	}
	
	public void cargarPersona() {
		Pagina3Controlador.listaPersonas.add(this.Persona);
	}

	public void eliminarPersona(Persona p){
		Pagina3Controlador.listaPersonas.remove(p);
	}
	
	//context contiene todas la variables que son manejadas por el framework
	//UIComponent es el componente que invoca el metodo
	//Object es el valor que trae el componente
	public void validarOjos( FacesContext context, UIComponent toValidate, Object value )  {
		context = FacesContext.getCurrentInstance();
		String ojosColor = (String)value;
		
		if ( ! this.OjosColores.contains(ojosColor) ) {
			//dejar inoperativo al componente que realizo el llamado a este metodo( el metodo validar)
			((UIInput)toValidate).setValid(false);
			
			context.addMessage( toValidate.getClientId() , new FacesMessage("no existe dicho color de ojos"));
		}
	}
	
	
}

