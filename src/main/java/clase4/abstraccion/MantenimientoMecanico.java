package clase4.abstraccion;

import java.util.Date;

public interface MantenimientoMecanico {

	boolean reparar(Date fecha, String autoParte, String mecanico);
	
	boolean cambioPiezas(Date fecha, String autoParte);
	
	String cambioAceite(Date fecha, String autoParte, String marca, String tipo, double cantidad);
	
}
