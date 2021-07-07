package clase2.laboratoriofinal;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Persona[] personas;
		int cantidad;
		
		System.out.println("Ingrese la cantidad de personas");
		cantidad = sc.nextInt();
		
		personas = new Persona[cantidad];
		
		for(int i = 0; i < personas.length; i++) {
			
			Persona p = new Persona();
			
			System.out.println("Ingrese el nombre");
			p.setNombre(sc.next());
			
			System.out.println("Ingrese el apellido");
			p.setApellido(sc.next());
			
			Documento d = new Documento();
			System.out.println("Ingrese el tipo de documento");
			d.setTipo(sc.next());
			
			System.out.println("Ingrese el numero de documento");
			d.setNumero(sc.nextInt());
			
			p.setDocumento(d);
			
			System.out.println("Ingrese la edad");
			p.setEdad(sc.nextInt());
			
			personas[i] = p;
			
		}
		
		
		for(int i = 0; i < personas.length; i++) {
			System.out.println("Nombre: " + personas[i].getNombre() + ", Apellido: " + personas[i].getApellido() +
					", Documento Tipo: " + personas[i].getDocumento().getTipo() + " Nro: " + personas[i].getDocumento().getNumero() +
					", Edad: " + personas[i].getEdad());
		}
		
		
		for (Persona persona : personas) {
			System.out.println("Nombre: " + persona.getNombre());
		}
		
		
		sc.close();

	}

}
