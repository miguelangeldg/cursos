package clase5.excepciones.nochequeadas;

public class App2 {

	public static void main(String[] args) {

		System.out.println("Inicio del programa");

		Integer a = 10;
		Integer b = 0;

		try {
			System.out.println("Resultado de la division " + (a / b));

		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por cero" + e.getMessage() + ", " + e.getCause());

		} catch (NullPointerException e) {
			System.out.println("No se puede dividir por un valor nulo");

		} finally {
			System.out.println("Fin del programa");
		}

	}

}
