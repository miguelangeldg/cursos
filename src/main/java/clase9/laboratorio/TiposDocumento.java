package clase9.laboratorio;

public enum TiposDocumento {
	
	DNI("Documento Nacional de Identidad"), 
	PAS("Pasaporte"), 
	LE("Libreta de Enrolamiento"), 
	CI("Cedula de Identidad");

	private String descripcion;

	private TiposDocumento(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
