package clase6.enumerados;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
//		Color c = Color.valueOf("ROJO");
		Color2 c = Color2.valueOf("AZUL");
		System.out.println(c.name());
		System.out.println(c.ordinal());
		System.out.println(Arrays.toString(c.values()));
		
		System.out.println(c.getCodigoHexadecimal());
		System.out.println(c.getCodigoRGB());

	}

}
