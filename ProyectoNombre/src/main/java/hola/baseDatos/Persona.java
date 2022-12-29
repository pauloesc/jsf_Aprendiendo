package hola.baseDatos;

public class Persona {

	private String Nombre;
	private String Apellido;
	private int edad;
	private String Sexo;
	private String ColorOjos;
	
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getColorOjos() {
		return ColorOjos;
	}
	public void setColorOjos(String colorOjos) {
		ColorOjos = colorOjos;
	}

	
	
}
