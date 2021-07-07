package clase3.laboratoriofinal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);
		
		Alumno[] alumnos;
		int c = 0;
		
		System.out.println("Ingrese la cantidad de alumnos");
		c = consola.nextInt();
		
		alumnos = new Alumno[c];
		
		String nombre, apellido, tipoDoc;
		int nroDoc, edad, cc;
		
		for (int i = 0; i < alumnos.length; i++) {		
			
			System.out.println("Ingrese el nombre");
			nombre = consola.next();
			
			System.out.println("Ingrese el apellido");
			apellido = consola.next();
			
			System.out.println("Ingrese el tipo de documento");
			tipoDoc = consola.next();
			
			System.out.println("Ingrese el nro de documento");
//			nroDoc = consola.nextInt();
			nroDoc = Integer.parseInt(consola.next());
			
			System.out.println("Ingrese la edad");
			edad = consola.nextInt();
			
			/*CARGAR LOS CURSO*/
			System.out.println("Ingrese la cantidad de cursos");
			cc = consola.nextInt();
			String [] cursos = new String[cc];
			
			for (int j = 0; j < cursos.length; j++) {
				System.out.println("Ingrese el curso");
				cursos[j] = consola.next();				
			}			
			
			/*CARGAR LOS ALUMNOS*/
			alumnos[i] = new Alumno(nombre, apellido, new Documento(tipoDoc, nroDoc), edad, cursos);
			
		}
		
		/*MUESTRO LOS ALUMNOS*/
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
		
		consola.close();		
	}

}
