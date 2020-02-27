/**
 * Codigo extraido de:
 * Titulo: DoublyLinkedNode
 * @author Duane A. Bailey
 * Fecha: 2007
 * Fuente: Java Structures (The 7 Edition)
 */
public class DoublyLinkedNode<E> extends Node<E>{
	

	protected E data;
	protected DoublyLinkedNode<E> nextElement;
	protected DoublyLinkedNode<E> previousElement;
	
	public DoublyLinkedNode(E v) {
		// post: constructs a single element{
		    this(v,null,null);
		}
	
	public DoublyLinkedNode(E v, DoublyLinkedNode<E> next, DoublyLinkedNode<E> previous){
	    data = v;
	    nextElement = next;
	    if (nextElement != null)
	        nextElement.previousElement = this;
	    previousElement = previous;
	    if (previousElement != null)
	        previousElement.nextElement = this;
	}
	
}
