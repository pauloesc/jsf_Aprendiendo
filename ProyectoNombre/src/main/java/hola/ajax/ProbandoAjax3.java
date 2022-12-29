package hola.ajax;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;

import hola.baseDatos.Casa;
import hola.baseDatos.Propietario;

@ManagedBean
@SessionScoped
public class ProbandoAjax3 {

	private static List<Propietario> listaPropietarios = new ArrayList<Propietario>();
	private static List<Casa> casas;// = new ArrayList<Casa>();
	
	private String prop;
	
	static {
		Propietario p1 = new Propietario();
		Propietario p2 = new Propietario();
		Propietario p3 = new Propietario();
		
		Casa c1 = new Casa( "casa en barrio 1", 1 );
		Casa c2 = new Casa( "casa en barrio 2", 2 );
		Casa c3 = new Casa( "casa en barrio 3", 3 );
		
		Casa c4 = new Casa( "casa en barrio 4", 4 );
		Casa c5 = new Casa( "casa en barrio 5", 5 );
		
		Casa c6 = new Casa( "casa en barrio 6", 6 );
		
		p1.setNombre("Adrian");
		p1.setApellido("Ad");
		p1.getCasas().add(c1);
		p1.getCasas().add(c2);
		p1.getCasas().add(c3);
		
		p2.setNombre("Bob");
		p2.setApellido("Bo");
		p2.getCasas().add(c4);
		p2.getCasas().add(c5);
		
		p3.setNombre("Carlos");
		p3.setApellido("Ca");
		p3.getCasas().add(c6);
		
		
		listaPropietarios.add(p1);
		listaPropietarios.add(p2);
		listaPropietarios.add(p3);
	}

	public List<Propietario> getListaPropietarios() {
		return listaPropietarios;
	}

	public void setListaPropietarios(List<Propietario> listaPropietarios) {
		ProbandoAjax3.listaPropietarios = listaPropietarios;
	}

	public String getProp() {
		return prop;
	}

	public void setProp(String prop) {
		this.prop = prop;
	}

	public List<Casa> getCasas() {
		return casas;
	}

	public void setCasas(List<Casa> casas) {
		ProbandoAjax3.casas = casas;
	}

	
	public void ActualizarListaCasaAjax( AjaxBehaviorEvent e ) {
		 
		for( Propietario p : listaPropietarios  ) {
			if( p.getApellido().equals(prop) ) {
				casas = p.getCasas();
			}
		} 
		
	}
	
	
}
