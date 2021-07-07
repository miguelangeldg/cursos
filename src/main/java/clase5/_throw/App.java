package clase5._throw;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner consola = new Scanner(System.in);
		int n;
		
		System.out.println("Ingrese un valor");
		n = consola.nextInt();
		
		try {
			if(n == 0) {
				throw new Exception("No puede ingresar un valor igual a cero");
			}
			
			System.out.println(n);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
