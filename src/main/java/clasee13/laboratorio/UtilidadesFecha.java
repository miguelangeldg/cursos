package clasee13.laboratorio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface UtilidadesFecha {
	
	String PATRON_FECHA = "dd/MM/yyyy";
	String PATRON_FECHA_SQL = "yyyy-MM-dd";
	
	SimpleDateFormat FORMATO_FECHA = new SimpleDateFormat(PATRON_FECHA);
	SimpleDateFormat FORMATO_FECHA_SQL = new SimpleDateFormat(PATRON_FECHA_SQL);

	
	static String getFechaAString(Date fecha) {
		return FORMATO_FECHA.format(fecha);
	}
	
	static Date getStringAFecha(String fecha) throws ParseException {
		return FORMATO_FECHA.parse(fecha);
	}

	static String getFechaAStringsSQL(Date fecha) {
		return FORMATO_FECHA_SQL.format(fecha);
	}

}
