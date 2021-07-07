package clase5.laboratorio;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner consola = new Scanner(System.in);

		Persona[] personas;
		int c = 0;

		System.out.println("Ingrese la cantidad de personas");
		c = consola.nextInt();

		personas = new Persona[c];

		String nombre, apellido, tipoDoc;
		int nroDoc, cc, tPersona;
		Date fechaNac;
		Persona persona = null;
		boolean docCorrecto;

		for (int i = 0; i < personas.length; i++) {

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

			System.out.println("Ingrese el nro de documento");
			nroDoc = Integer.parseInt(consola.next());

			/**OBTENER FECHA DESDE LA CONSOLA*/
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

			personas[i] = persona;

		}

		for (int i = 0; i < personas.length; i++) {
			personas[i].mostrarTipoPersona();
		}

		consola.close();
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
	
	
	private static LocalDate obtenerFechaJava8() {
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

}
