package clase5.fechas;

import java.util.Date;
import java.util.Scanner;

public class FechaDate {

	public static void main(String[] args) {
		
		System.out.println("\n--------FECHA ACTUAL");
		fechaActual();
		
		System.out.println("\n--------SOLO FECHA");
		soloFecha();
		
		System.out.println("\n--------FECHA Y HORA");
		fechaYHora();
		
		System.out.println("\n--------LEER FECHA POR CONSOLA");
		Date date = obtenerFecha();
		System.out.println(date);


	}
	
	private static void fechaActual() {
		Date fecha = new Date();
		System.out.println(fecha);
		System.out.println("Año: " + (fecha.getYear() + 1900));
		System.out.println("Mes: " + (fecha.getMonth() + 1));
		System.out.println("Dia: " + fecha.getDate());
		System.out.println("Dia de la semana: " + fecha.getDay());
	}
	
	private static void soloFecha() {
		Date fecha = new Date(2021-1900, 5, 24);
		System.out.println(fecha.getYear() + 1900);
		System.out.println(fecha.getMonth() + 1);
		System.out.println(fecha.getDate());
	}
	
	private static void fechaYHora() {
		Date fecha = new Date(2021-1900, 5, 24, 20, 58, 10);
		System.out.println("Año: " + fecha.getYear() + 1900);
		System.out.println("Mes: " + fecha.getMonth() + 1);
		System.out.println("Dia: " + fecha.getDate());
		System.out.println("Hora: " + fecha.getHours());
		System.out.println("Minuto: " + fecha.getMinutes());
		System.out.println("Segundo: " + fecha.getSeconds());
	}
	
	
	private static Date obtenerFecha() {
		Scanner consola = new Scanner(System.in);
		Date fecha = null;
		int anio, mes, dia;

		System.out.println("Ingrese el año");
		anio = consola.nextInt();

		System.out.println("Ingrese el mes");
		mes = consola.nextInt();

		System.out.println("Ingrese el dia");
		dia = consola.nextInt();

		fecha = new Date(anio - 1900, mes - 1, dia);

		consola.close();

		return fecha;
	}

}
