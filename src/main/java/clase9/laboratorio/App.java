package clase9.laboratorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class App {

	private static Scanner consola = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Persona> personas = new HashSet<>();
		List<Persona> listaPersonas = new ArrayList<>();
		int c;

		System.out.println("Ingrese la cantidad de personas");
		c = consola.nextInt();

		String nombre, apellido;
		int nroDoc, cc, tPersona;
		Date fechaNac;
		Persona persona = null;
		TiposDocumento tipoDoc;
		Date fechaCargo;
		double sueldo;
		String carrera;

		for (int i = 0; i < c; i++) {

			System.out.println("Ingrese el tipo de persona");
			System.out.println("1 - Alumno.");
			System.out.println("2 - Director.");
			System.out.println("3 - Profesor.");
			System.out.println("4 - Administrativo.");
			System.out.println();
			tPersona = consola.nextInt();

			System.out.println("Ingrese el nombre");
			nombre = consola.next();

			System.out.println("Ingrese el apellido");
			apellido = consola.next();

			while (true) {
				System.out.print("Ingrese el Tipo de Documento de la Persona [" + (i + 1) + "]: ");

				try {
					tipoDoc = TiposDocumento.valueOf(consola.next().toUpperCase());
					break;

				} catch (Exception e) {
					System.out.println("Tipo de documento no valido");
				}

			}

			System.out.println("Ingrese el nro de documento");
			nroDoc = Integer.parseInt(consola.next());

			System.out.println("Ingrese la fecha de nacimiento");
			fechaNac = obtenerFecha(); // obtenerFechaJava8();

			switch (tPersona) {
			case 1: // ALUMNO
				System.out.println("Ingrese la cantidad de cursos");
				cc = consola.nextInt();
				String[] cursos = new String[cc];

				for (int j = 0; j < cursos.length; j++) {
					System.out.println("Ingrese el curso");
					cursos[j] = consola.next();
				}

				/** CAMBIAMOS EL CONTRUCTOR DE DOCUMENTO PARA USAR EL ENUMERADO */
				persona = new Alumno(nombre, apellido, new Documento(tipoDoc, nroDoc), fechaNac, cursos);
				
				break;

			case 2: // DIRECTOR
				System.out.println("Ingrese la Fecha de inicio del Cargo");
				fechaCargo = obtenerFecha();

				System.out.println("Ingrese la Carrera");
				carrera = consola.next();

				System.out.print("Ingrese el Sueldo");
				sueldo = consola.nextFloat();

				persona = new Director(nombre, apellido, new Documento(tipoDoc, nroDoc), fechaNac, fechaCargo, sueldo, carrera);
				
				break;

			case 3: // PROFESOR
				System.out.println("Ingrese la Fecha de inicio del Cargo");
				fechaCargo = obtenerFecha();

				System.out.print("Ingrese el Sueldo");
				sueldo = consola.nextFloat();

				System.out.print("Ingrese la cantidad de cursos");
				cc = consola.nextInt();
				cursos = new String[cc];

				for (int j = 0; j < cursos.length; j++) {
					System.out.println("Ingrese el curso");
					cursos[j] = consola.next();
				}

				persona = new Profesor(nombre, apellido, new Documento(tipoDoc, nroDoc), fechaNac, fechaCargo, sueldo,
						cursos);
				break;
				

			case 4: // ADMINISTRATIVO
				System.out.println("Ingrese la Fecha de inicio del Cargo");
				fechaCargo = obtenerFecha();

				System.out.print("Ingrese el Sueldo");
				sueldo = consola.nextFloat();

				persona = new Administrativo(nombre, apellido, new Documento(tipoDoc, nroDoc), fechaNac, fechaCargo,
						sueldo);
								
				/**AGREGAMOS UN ADMINISTRATIVO A LA BASE DE DATOS*/
				AdministrativoImpl adm = new AdministrativoImpl();
				adm.insertar(persona);
				break;
			}

			personas.add(persona);			
			
		}

		for (Persona p : personas) {
			System.out.println(p);
			p.mostrarTipoPersona();
		}

		/** AGREGAMOS LA COLECCION DE PERSONAS A UNA LISTA PARA PODER ORDENARLA */
		listaPersonas.addAll(personas);
		listaPersonas.sort(new OrdenDocumento());

		System.out.println("\nPersonas Ordenadas:");
		for (Persona p : listaPersonas) {
			System.out.println(p);
		}
		
		asistencia(listaPersonas);

		consola.close();
	}
			
	/**TOMA ASISTENCIA*/
	private static void asistencia(Collection<Persona> personas) {
		Queue<Persona> colaPersonas = new PriorityQueue<Persona>(new OrdenEdadDesc());
		colaPersonas.addAll(personas);

		System.out.println("COLA DE ASISTENCIA");
		while (!colaPersonas.isEmpty()) {
			System.out.println("Por atender a: " + colaPersonas.peek());
			System.out.println("Atendiendo a: " + colaPersonas.poll());
		}
	}
	
	
	/** OBTENEMOS LA FECHA DE TIPO DATE */
	private static Date obtenerFecha() {
		Date fecha = null;
		int anio, mes, dia;

		System.out.println("Ingrese el a�o");
		anio = consola.nextInt();

		System.out.println("Ingrese el mes");
		mes = consola.nextInt();

		System.out.println("Ingrese el dia");
		dia = consola.nextInt();

		fecha = new Date(anio - 1900, mes - 1, dia);

		return fecha;
	}

	/** OBTENEMOS LA FECHA DE TIPO LOCALDATE */
	private static LocalDate obtenerFechaJava8() {
		LocalDate fecha = null;
		int anio, mes, dia;

		System.out.println("Ingrese el año");
		anio = consola.nextInt();

		System.out.println("Ingrese el mes");
		mes = consola.nextInt();

		System.out.println("Ingrese el dia");
		dia = consola.nextInt();

		fecha = LocalDate.of(anio, mes, dia);

		return fecha;
	}

}
