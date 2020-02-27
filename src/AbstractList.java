/**
 * Codigo extraido de:
 * Titulo: Abstract List
 * @author Duane A. Bailey
 * Date: 2007
 * Fuente: Java Structures (The 7 Edition)
 * 
 * 
 * Estas funciones se comparten por todas las implementaciones de iList
 */
public abstract class AbstractList<E> implements iList<E> {
	public AbstractList() {
	   // post: does nothing
	   }
	public boolean isEmpty()
	   // post: returns true iff list has no elements
	   {
	      return size() == 0;
	   }
	public boolean contains(E value)
	  // pre: value is not null
	  // post: returns true iff list contains an object equal to value
	  {
		return -1 != indexOf(value);
	  }
}
