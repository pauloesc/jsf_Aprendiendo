package hola.validaciones;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "validadorDeSumaCorrecta")
public class ValidacionAlgebra implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		
		String suma = (String)value;
		
		boolean esNumero = suma.chars().allMatch( Character::isDigit );
		
		FacesMessage mensaje = new FacesMessage();
		
		if(!esNumero) {
			mensaje.setSeverity(FacesMessage.SEVERITY_ERROR);
			mensaje.setSummary("hoal");
			mensaje.setDetail("No ingresaste un nunero");
			throw new ValidatorException(mensaje);
		}
			
		else {
			if (! Integer.valueOf(suma).equals(10) ) {
				mensaje.setSeverity(FacesMessage.SEVERITY_ERROR);
				mensaje.setSummary("hoal");
				mensaje.setDetail("No sabes sumar!!");
				throw new ValidatorException(mensaje);
			}
		}
	}

}
