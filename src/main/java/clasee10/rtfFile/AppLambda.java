package clasee10.rtfFile;

public class AppLambda {

	public static void main(String[] args) {
		
		MiFunctionalInterface mi;
		
		mi = n -> n % 2 == 0;
		
		System.out.println(mi.esPar(6));

	}

}
