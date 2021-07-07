package clase2.mod_protected;

public class Vehiculo {
	
	protected String patente;
	protected boolean encendido;
		

	public Vehiculo() {
		super();
	}

	
	public Vehiculo(String patente, boolean encendido) {
		super();
		this.patente = patente;
		this.encendido = encendido;
	}	
	
	
	protected void cambiarEstado(boolean encendido) {
		this.encendido = encendido;
	}
	
}
