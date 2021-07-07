package clase4.laboratorio;

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
		
		for (int i = 0; i < personas.length; i++) {	
			
			System.out.println("Ingrese el nombre");
			nombre = consola.next();
			
			System.out.println("Ingrese el apellido");
			apellido = consola.next();
			
			System.out.println("Ingrese el tipo de documento");
			tipoDoc = consola.next();
			
			System.out.println("Ingrese el nro de documento");
			nroDoc = Integer.parseInt(consola.next());
			
			System.out.println("Ingrese la fecha de nacimiento");
			fechaNac = new Date(); // FECHA ACTUAL
			
			System.out.println("Ingrese el tipo de persona");
			tPersona = consola.nextInt();
			
			switch(tPersona) {
			case 1: // ALUMNO				
				System.out.println("Ingrese la cantidad de cursos");
				cc = consola.nextInt();
				String [] cursos = new String[cc];
				
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

}
