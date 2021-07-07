package clase1;

import java.util.Scanner;

public class SimulaOrSwitch {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int dia;
		
		System.out.println("Ingrese el dia de la semana");
		dia = teclado.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("es lunes");
//			break;
		case 2:
			System.out.println("es martes");
			break;
		case 3:
			System.out.println("es miercoles");
			break;
		case 4:
			System.out.println("es jueves");
			break;
		case 5:
			System.out.println("es viernes");
			break;
		case 6:
		case 7:
			System.out.println("es fin de semana");
			break;
		}
		
		teclado.close();

	}

}
