package clase3.clases.envoltorio;

public class App {

	public static void main(String[] args) {
		
//		System.out.println(Byte.MAX_VALUE);
//		System.out.println(Byte.MIN_VALUE);
		
		
		Byte n1 = new Byte("112");
		System.out.println(n1);
		
		Byte n2 = new Byte((byte) 12);
		System.out.println(n2);
		
		
		System.out.println(n1.byteValue());
		
		/*MIEMBROS DE CLASE*/
		Byte n3 = Byte.valueOf("112");
		System.out.println(n3);
		
		System.out.println(Byte.parseByte("100")); // VALOR PRIMITIVO
		
		Byte n4 = Byte.parseByte("100"); //BOXING
		
		byte n5 = Byte.valueOf("25"); // UNBOXING

	}

}
