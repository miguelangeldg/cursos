package clase6.enumerados;

public enum Color2 {

	NEGRO("000000", "0,0,0"), 
	AZUL("0000FF","0,0,255"), 
	MARRON("4E3B31","78,59,49"); 	
	
	private String codigoHexadecimal;
	private String codigoRGB;
	
	private Color2(String codigoHexadecimal, String codigoRGB) {
		this.codigoHexadecimal = codigoHexadecimal;
		this.codigoRGB = codigoRGB;
	}

	public String getCodigoHexadecimal() {
		return codigoHexadecimal;
	}

	public String getCodigoRGB() {
		return codigoRGB;
	}

}
