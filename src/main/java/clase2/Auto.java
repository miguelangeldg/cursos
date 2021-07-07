package clase2;

public class Auto {

	private String color;
	private String marca;
	private String patente;
	private boolean encendido;

	public Auto() {
		super();
	}

	public Auto(String color, String marca, String patente, boolean encendido) {
		super();
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		setPatente(patente);
	}

	public void cambiarEstado(boolean encendido) {
		this.encendido = encendido;
	}

	public void cambiarEstado() {
		modificarEstado();
	}

	private void modificarEstado() {
		encendido = !encendido;
	}

	public void encender() {
		encendido = true;
	}

	public void apagar() {
		encendido = false;
	}

	public String mostrarDatos() {
		String mensaje = "Color " + color + ", Marca " + marca + ", Patente " + patente + ", " + "Estado "
				+ (encendido ? "encendido" : "apagado");
		return mensaje;
	}

	/* getters and setters */
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		if (patente != null)
			this.patente = patente;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

}
