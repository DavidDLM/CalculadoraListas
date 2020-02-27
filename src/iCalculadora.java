/**
 * @author Mario de Leon
 * @author Mariana Morales
 *
 */
public interface iCalculadora {

	/** 
	 * Suma dos enteros
	 * @param a
	 * @param b
	 * @return resultado
	 */
	public int sumar(int a, int b); //Sumar
	// pre: entran dos enteros
	   // post: suma los enteros y devuelve el resultado
	/** 
	 * Resta dos enteros
	 * @param a
	 * @param b
	 * @return resultado
	 */
	public int restar(int a, int b); //Restar
	// pre: entran dos enteros
	   // post: suma los enteros y devuelve el resultado
	
	/** 
	 * Multiplica dos enteros
	 * @param a
	 * @param b
	 * @return resultado
	 */
	public int multiplicar(int a, int b); //Multiplicar
	// pre: entran dos enteros
	   // post: suma los enteros y devuelve el resultado
	
	/** 
	 * Divide dos enteros
	 * @param a
	 * @param b
	 * @return resultado
	 */
	public int dividir(int a, int b); //Dividir
	// pre: entran dos enteros
	   // post: suma los enteros y devuelve el resultado

}
