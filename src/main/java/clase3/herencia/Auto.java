package clase3.herencia;

public class Auto {

	private String color;
	private String marca;
	private Patente patente;
	private boolean encendido;
	
	public static String concesionaria;
	
	static {
		concesionaria = "Autos Srl";		
//		System.out.println("Bloque estatico");
	}
	
	
	public Auto() {
		super();
//		System.out.println("Constructor de la clase Auto");
	}

	public Auto(String color, String marca, Patente patente, boolean encendido) {
		super();
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.encendido = encendido;
	}
	

	@Override
	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", " + patente + ", encendido=" + encendido + "]";
	}

	/*METODO GUARDAR*/
	public void guardar() {
		System.out.println("Guardar un auto");
	}
	
	
	/*GETTERS AND SETTERS*/
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

	public Patente getPatente() {
		return patente;
	}

	public void setPatente(Patente patente) {
		this.patente = patente;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	
	public static String getConcesionaria() {
		return concesionaria;
	}

	public static void setConcesionaria(String concesionaria) {
		Auto.concesionaria = concesionaria;
	}
	
	

}
