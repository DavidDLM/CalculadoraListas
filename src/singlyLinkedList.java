import java.util.Iterator;

/**
 * Codigo extraido de:
 * Titulo: Funciones de Lista Circular
 * @author Duane A. Bailey
 * Fecha: 2007
 * Fuente: Java Structures (The 7 Edition)
 */
public class singlyLinkedList<E> extends AbstractList<E>{

	protected int count; // list size
	protected Node<E> head,tail; // ref. to first element
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		// note order that things happen:
	     // head is parameter, then assigned
	     head = new Node<E>(value, head);
	     count++;
	}

	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		Node<E> temp = new Node<E>(value,null);
	      if (head != null)
	     {
	         // pointer to possible tail
	         Node<E> finger = head;
	         while (finger.next() != null)
	         {
	                finger = finger.next();
	         }
			 
	         finger.setNext(temp);
	      } else head = temp;
		  
		  count++;
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return head.value();
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		Node<E> temp = head;
	     head = head.next(); // move head down list
	     count--;
	     return temp.value();
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(E value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(E value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int i, E o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int i, E o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


}