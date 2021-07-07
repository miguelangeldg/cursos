package clase6.laboratorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App {
	
	private static Scanner consola = new Scanner(System.in);

	public static void main(String[] args) {

//		Persona[] personas;		
		Set<Persona> personas = new HashSet<>();
		
		List<Persona> listaPersonas = new ArrayList<>();
		
		int c = 0;
		System.out.println("Ingrese la cantidad de personas");
		c = consola.nextInt();

//		personas = new Persona[c];

		String nombre, apellido, tipoDoc;
//		TiposDocumento tipoDoc;
		int nroDoc, cc, tPersona;
		Date fechaNac;
		Persona persona = null;
		boolean docCorrecto;

//		for (int i = 0; i < personas.length; i++) {
		for (int i = 0; i < c; i++) {

			System.out.println("Ingrese el nombre");
			nombre = consola.next();

			System.out.println("Ingrese el apellido");
			apellido = consola.next();

			
			while (true) {
				System.out.println("Ingrese el tipo de documento");
				tipoDoc = consola.next();
				try {
					docCorrecto = false;
					for (int j = 0; j < DocumentosValidos.tipoDocumento.length; j++) {
						if (tipoDoc.equalsIgnoreCase(DocumentosValidos.tipoDocumento[j])) {
							docCorrecto = true;
							break;
						}
					}
					if (!docCorrecto) {
						throw new PersonaException(1);
					}
					break;
				} catch (PersonaException e) {
					System.out.println(e.getMessage());
				}
			}
			
			/*
			while (true) {
				System.out.print("Ingrese el Tipo de Documento: ");

				try {
					tipoDoc = TiposDocumento.valueOf( consola.next().toUpperCase() );
					break;
					
				} catch (Exception e) {
					System.out.println("Tipo de documento no valido");
				}
			}
			*/
			
			System.out.println("Ingrese el nro de documento");
			nroDoc = Integer.parseInt(consola.next());
			
			System.out.println("Ingrese la fecha de nacimiento");
			fechaNac = obtenerFecha(); // obtenerFechaJava8();

			System.out.println("Ingrese el tipo de persona");
			tPersona = consola.nextInt();

			switch (tPersona) {
				case 1: // ALUMNO
					System.out.println("Ingrese la cantidad de cursos");
					cc = consola.nextInt();
					String[] cursos = new String[cc];
	
					for (int j = 0; j < cursos.length; j++) {
						System.out.println("Ingrese el curso");
						cursos[j] = consola.next();
					}
	
					persona = new Alumno(nombre, apellido, new Documento(tipoDoc, nroDoc), fechaNac, cursos);
	
					break;
					
					case 2: // DIRECTOR

						break;
			}

//			personas[i] = persona;
			personas.add(persona);

		}

//		for (int i = 0; i < personas.length; i++) {
//			personas[i].mostrarTipoPersona();
//		}
		
		for (Persona p : personas) {
			System.out.println(p);
			p.mostrarTipoPersona();
		}

		
		listaPersonas.addAll(personas); //agregamos el set a la lista
		
		listaPersonas.sort(new OrdenDocumento());
		

		System.out.println("\nPersonas Ordenadas:");
		for (Persona p : listaPersonas) {
			System.out.println(p);
		}

		consola.close();
	}

	
	
	/***
	 * 
	 * @return java.util.Date
	 */
	private static Date obtenerFecha() {
		Date fecha = null;
		int anio, mes, dia;

		System.out.println("Ingrese el año");
		anio = consola.nextInt();

		System.out.println("Ingrese el mes");
		mes = consola.nextInt();

		System.out.println("Ingrese el dia");
		dia = consola.nextInt();

		fecha = new Date(anio - 1900, mes - 1, dia);

		return fecha;
	}
	
	
	/**
	 * A partir de java 8
	 * @return java.time.LocalDate
	 */
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
