import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Mario de Leon
 * @author Mariana Morales
 *
 */
public class ListaTest {
	CalculadoraFunciones calc = new CalculadoraFunciones();
	ListFactory<Integer> listaType = new ListFactory<Integer>();
	iList<Integer> simple = listaType.getList("Simple");
	iList<Integer> doubleL = listaType.getList("Double");
	iList<Integer> circular = listaType.getList("Circular");
	
	@Test
	public void simpleTest() {
		simple.addFirst(7);
		assertEquals(new Integer(7), Integer.valueOf(simple.getFirst()));
	}
	
	@Test
	public void doubleTest(){
		doubleL.addFirst(8);
		assertEquals(new Integer(8), Integer.valueOf(doubleL.getFirst()));
	}
	
	@Test
	public void circularTest() {
		circular.addLast(15);
		assertEquals(new Integer(15), Integer.valueOf(circular.getLast()));
	}

}
