package clase5.excepciones.propias.auto;

public abstract class Auto implements MantenimientoMecanico {

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
		setPatente(patente);
		this.encendido = encendido;
	}

	@Override
	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", " + patente + ", encendido=" + encendido + "]";
	}

	/* METODO ABSTRACTO */
	public abstract void vender();

	/* METODO GUARDAR */
	public void guardar() {
		System.out.println("Guardar un auto");
	}

	/* GETTERS AND SETTERS */
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

	/**EXCEPTION PROPIA*/
	public void setPatente(Patente patente) {
		
		try {

			if (patente == null) {
				throw new AutoException(1);

			} else if (patente.getNumero().length() != 8) {
				throw new AutoException(2);
			}

		} catch (AutoException e) {
			System.out.println(e.getMessage());
		}

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
