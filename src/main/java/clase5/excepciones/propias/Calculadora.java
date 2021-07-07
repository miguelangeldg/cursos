package clase5.excepciones.propias;

public class Calculadora {
	
	public int dividir(int dividendo, int divisor) throws DivisionCeroException {
		
		if(divisor == 0) {
			throw new DivisionCeroException();
		}
		
		return dividendo / divisor;
		
	}

}
