package clasee13.interfazfuncional;

public class App {

	public static void main(String[] args) {
		
		int a = 4, b = 2;
		int resultado;
		
		CalculadoraFuncional operacion;
		
		//         parametros  cuerpo de la lambda
		operacion = (n1, n2) -> n1 + n2;
		//                 lambda
		
		resultado = operacion.calcular(a, b);		
		System.out.println("la suma es " + resultado);
		
		operacion = (n1, n2) -> n1 - n2;
		resultado = operacion.calcular(a, b);
		System.out.println("la resta es " + resultado);

	}

}
