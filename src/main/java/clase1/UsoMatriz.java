package clase1;

import java.util.Scanner;

public class UsoMatriz {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int fila = 2, col = 3;
		
		int[][] matriz = new int[fila][col];
		

		for (int i = 0; i < fila; i++) {

			for (int j = 0; j < col; j++) {

				System.out.print("A[" + i + "][" + j + "]=");
				matriz[i][j] = teclado.nextInt();

			}
			
			System.out.println();

		}

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		teclado.close();

	}

}
