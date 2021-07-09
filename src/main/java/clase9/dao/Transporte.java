package clase9.dao;

public abstract class Transporte extends Auto {
	
	private String licencia;
	private String tipo;	
	
	public Transporte() {
		super();
	}

	public Transporte(String color, String marca, Patente patente, boolean encendido, String licencia, String tipo) {
		super(color, marca, patente, encendido);
		this.licencia = licencia;
		this.tipo = tipo;
	}


	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
