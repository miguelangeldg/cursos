package clase5.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class FechaLocalDate {

	/** JAVA 8 */	
	public static void main(String[] args) {
		
		System.out.println("\n--------FECHA ACTUAL");
		fechaActual();
		
		System.out.println("\n--------SOLO FECHA");
		soloFecha();
		
		System.out.println("\n--------FECHA Y HORA");
		fechaYHora();
		
//		System.out.println("\n--------LEER FECHA POR CONSOLA");
//		LocalDate fecha = obtenerFecha();
//		System.out.println("Año: " + fecha.getYear());
//		System.out.println("Mes: " + fecha.getMonthValue());
//		System.out.println("Dia: " + fecha.getDayOfMonth());
		
		System.out.println("\n--------CALCULAR LA EDAD");
		System.out.println("Edad: " + calcularEdad());
		
		System.out.println("\n--------CONVERTIR FECHAS");
		System.out.println(convertToLocalDate(new Date()));
		
	}
	
	private static void fechaActual() {
		LocalDate fecha = LocalDate.now();
		System.out.println(fecha);
		System.out.println("Año: " + fecha.getYear());
		System.out.println("Mes: " + fecha.getMonthValue());
		System.out.println("Dia: " + fecha.getDayOfMonth());
	}
	
	private static void soloFecha() {
		LocalDate fecha = LocalDate.of(2021, 6, 24);
		System.out.println("Año: " + fecha.getYear());
		System.out.println("Mes: " + fecha.getMonthValue());
		System.out.println("Dia: " + fecha.getDayOfMonth());
	}
	
	private static void fechaYHora() {
		LocalDateTime fechaYHora = LocalDateTime.of(2021, 6, 24, 21, 15, 30);
		System.out.println("Año: " + fechaYHora.getYear());
		System.out.println("Mes: " + fechaYHora.getMonthValue());
		System.out.println("Dia: " + fechaYHora.getDayOfMonth());
		System.out.println("Hora: " + fechaYHora.getHour());
		System.out.println("Minuto: " + fechaYHora.getMinute());
		System.out.println("Segundos: " + fechaYHora.getSecond());
	}
	
	
	private static LocalDate obtenerFecha() {
		Scanner consola = new Scanner(System.in);
		LocalDate fecha = null;
		int anio, mes, dia;

		System.out.println("Ingrese el año");
		anio = consola.nextInt();

		System.out.println("Ingrese el mes");
		mes = consola.nextInt();

		System.out.println("Ingrese el dia");
		dia = consola.nextInt();
		
		fecha = LocalDate.of(anio, mes, dia);
		
		consola.close();

		return fecha;
	}
	
	
	private static int calcularEdad() {
		int edad = 0;
		
		Period p = Period.between(LocalDate.of(1968, 10, 9), LocalDate.now());
		edad = p.getYears();
		
		return edad;
	}
	
	
	private static LocalDate convertToLocalDate(Date fecha) {
        return fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

}
