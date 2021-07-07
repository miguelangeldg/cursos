package clase5.excepciones.propias;

public class AppCalculadora {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		try {
			c.dividir(10, 0);
			
		} catch (DivisionCeroException e) {
			System.out.println(e.getMessage());
		}

	}

}
