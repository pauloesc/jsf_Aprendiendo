package hola.baseDatos;

public class Casa {

	private String dir;
	private int numeroPuerta;
	
	public Casa(String dir, int numeroPuerta) {
		this.dir = dir;
		this.numeroPuerta = numeroPuerta;
	}
	
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public int getNumeroPuerta() {
		return numeroPuerta;
	}
	public void setNumeroPuerta(int numeroPuerta) {
		this.numeroPuerta = numeroPuerta;
	} 
	
	
}
