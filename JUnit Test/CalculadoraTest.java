import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Mario de Leon
 * @author Mariana Morales
 *
 */
public class CalculadoraTest {
	CalculadoraFunciones calc = new CalculadoraFunciones();
	@Test
	public void Sumatest() {
		assertEquals(8, calc.sumar(2, 6));
	}
	@Test
	public void Restatest() {
		assertEquals(-4, calc.restar(2, 6));
	}
	@Test
	public void MultipTest() {
		assertEquals(12, calc.multiplicar(2, 6));
	}
	@Test
	public void DivTest() {
		assertEquals(3, calc.dividir(6, 2));
	}

}
