/**
 * @author Mario de Leon
 * @author Mariana Morales
 *
 */
public class CalculadoraFunciones implements iCalculadora{

	@Override
	public int sumar(int a, int b) {
		// TODO Auto-generated method stub
		int resultado = a+b;
		return resultado;
	}

	@Override
	public int restar(int a, int b) {
		// TODO Auto-generated method stub
		int resultado = a-b;
		return resultado;
	}

	@Override
	public int multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		int resultado = a*b;
		return resultado;
	}

	@Override
	public int dividir(int a, int b) {
		// TODO Auto-generated method stub
		int resultado = 0;
		try {
			resultado = a/b;
			
		}catch (Exception e) {
			System.out.println("Operacion invalida.");
			resultado = 999999999;
		}
		return resultado;			
	}		
}
