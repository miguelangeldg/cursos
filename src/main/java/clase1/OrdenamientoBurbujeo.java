package clase1;

import java.util.Arrays;

public class OrdenamientoBurbujeo {

	public static void main(String[] args) {
		
		int [] notas = {9,8,10,4};
		String [] nombres = {"pedro","juan","jose","felipe"};
		
		System.out.println(Arrays.toString(notas));
		System.out.println(Arrays.toString(nombres));
		
		for(int i = 0; i < notas.length; i++) {
			
			System.out.println(i);
			
			for(int j = 0; j < notas.length; j++) {
				
				if(notas[i] < notas[j]) {
					int notaaux = notas[i];
					notas[i] = notas[j];
					notas[j] = notaaux;
					
					System.out.println(Arrays.toString(notas));
					
					String nomaux = nombres[i];
					nombres[i] = nombres[j];
					nombres[j] = nomaux;
				}
				
			}			
		}
		
		System.out.println();
		System.out.println(Arrays.toString(notas));
		System.out.println(Arrays.toString(nombres));

	}

}
