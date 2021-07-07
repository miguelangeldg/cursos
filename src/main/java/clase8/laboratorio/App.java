package clase8.laboratorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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

		int c = 0;
		System.out.println("Ingrese la cantidad de personas");
		c = consola.nextInt();

		String nombre, apellido, tipoDoc;
//		TiposDocumento tipoDoc;
		int nroDoc, cc, tPersona;
		Date fechaNac;
		Persona persona = null;
		boolean docCorrecto;
		/* ATRIBUTOS DEL DIRECTOR */
		Date fechaCargo;
		double sueldo;
		String carrera;

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
			 * while (true) { System.out.print("Ingrese el Tipo de Documento: ");
			 * 
			 * try { tipoDoc = TiposDocumento.valueOf( consola.next().toUpperCase() );
			 * break;
			 * 
			 * } catch (Exception e) { System.out.println("Tipo de documento no valido"); }
			 * }
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
				System.out.println("Ingrese la Fecha de inicio del Cargo");
				fechaCargo = obtenerFecha();

				System.out.println("Ingrese la Carrera");
				carrera = consola.next();

				System.out.print("Ingrese el Sueldo");
				sueldo = consola.nextFloat();

				persona = new Director(nombre, apellido, new Documento(tipoDoc, nroDoc), fechaNac, fechaCargo, sueldo,
						carrera);
				
				/**AGREGAMOS UNA PERSONA A LA BASE DE DATOS*/
				insertar(persona);
				

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
				break;
			}

			personas.add(persona);

		}

		for (Persona p : personas) {
			System.out.println(p);
			p.mostrarTipoPersona();
		}

		listaPersonas.addAll(personas); // agregamos el set a la lista
		listaPersonas.sort(new OrdenDocumento());

		System.out.println("\nPersonas Ordenadas:");
		for (Persona p : listaPersonas) {
			System.out.println(p);
		}

		asistencia(listaPersonas);

		consola.close();
	}
	
	
	private static void insertar(Persona p) {
		
		Director persona = (Director) p;

		try (Connection conexion = conectarBaseDeDatos()) { 

			String sql = "insert into director(nombre, apellido, tipoDocumento, numeroDocumento, fechaNacimiento, fechaCargo, sueldo, carrera) "
					+ "values ('" + persona.getNombre() + "', '" + persona.getApellido() + "', '" 
					+ persona.getDocumento().getTipo() + "', " + persona.getDocumento().getNumero() + ", '"
					+ new java.sql.Date(persona.getFechaNacimiento().getTime()) + "', '"
					+ new java.sql.Date( persona.getFechaCargo().getTime()) + "', " + persona.getSueldo() + ", '" + persona.getCarrera() 
					+ "')";

			Statement st = conexion.createStatement();
			
			System.out.println(sql);
			
			st.execute(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	
	private static Connection conectarBaseDeDatos() throws SQLException {

		Connection conexion = null;

		try {			
			String driver = "org.mariadb.jdbc.Driver";
			String url = "jdbc:mariadb://localhost:3306/personas";
			
			String usuario = "root";
			String clave = "123";

			Class.forName(driver);

			conexion = DriverManager.getConnection(url, usuario, clave);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return conexion;
	}
	
	
	

	/**
	 * Implementamos una cola para atender a las personas
	 * 
	 * @param personas
	 */
	private static void asistencia(Collection<Persona> personas) {

		Queue<Persona> colaPersonas = new PriorityQueue<Persona>(new OrdenEdad());
		colaPersonas.addAll(personas);

		while (!colaPersonas.isEmpty()) {
			System.out.println("Por atender a: " + colaPersonas.peek());
			System.out.println("Atendido: " + colaPersonas.poll());
		}

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
	 * 
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
