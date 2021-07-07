package clase2.mod_protected;

class Auto extends Vehiculo {
	
	private String color;
	private String marca;	
				
	public Auto() {
		super();
	}

	public Auto(String color, String marca, String patente, boolean encendido) {
		super(patente, encendido);
		this.color = color;
		this.marca = marca;
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
		String mensaje = "Color " + color + ", Marca " + marca + ", Patente " + patente + ", "
				+ "Estado " + ( encendido ? "encendido" : "apagado" );		
		return mensaje;
	}

}
