import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Titulo: Doubly linked list implementation
 * @author Nataraja Gootooru (Java2Novice)
 * Date: 2020
 * Fuente: https://www.java2novice.com/data-structures-in-java/linked-list/doubly-linked-list/
 */
public class doublyLinkedList<E> extends AbstractList<E>{
	 
    private Node head;
    private Node tail;
    private int size;

     
    public doublyLinkedList() {
        size = 0;
    }
    /**
     * this class keeps track of each element information
     * @author java2novice
     *
     */
    private class Node {
        E element;
        Node next;
        Node prev;
 
        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

		public E value() {
			// TODO Auto-generated method stub
			return element;
		}
		public Node next()
		   // post: returns reference to next value in list
		{
			return next;
		}
        
    }
    /**
     * returns the size of the linked list
     * @return
     */
    public int size() { 
    	return size; 
    	}
     
    /**
     * return whether the list is empty or not
     * @return
     */
    public boolean isEmpty() { 
    	return size == 0; 
    	}
     
    /**
     * adds element at the starting of the linked list
     * @param element
     */
    public void addFirst(E element) {
        Node tmp = new Node(element, head, null);
        if(head != null ) {head.prev = tmp;}
        head = tmp;
        if(tail == null) { tail = tmp;}
        size++;
        System.out.println("adding: "+element);
    }
     
    /**
     * adds element at the end of the linked list
     * @param element
     */
    @Override
    public void addLast(E element) {
         
        Node tmp = new Node(element, null, tail);
        if(tail != null) {tail.next = tmp;}
        tail = tmp;
        if(head == null) { head = tmp;}
        size++;
        System.out.println("adding: "+element);
    }
     
    /**
     * this method walks forward through the linked list
     */
    public void iterateForward(){
         
        System.out.println("iterating forward..");
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.element);
            tmp = tmp.next;
        }
    }
     
    /**
     * this method walks backward through the linked list
     */
    public void iterateBackward(){
         
        System.out.println("iterating backword..");
        Node tmp = tail;
        while(tmp != null){
            System.out.println(tmp.element);
            tmp = tmp.prev;
        }
    }
     
    /**
     * this method removes element from the start of the linked list
     * @return
     */
    @Override
    public E removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = head;
        if(size == 1) {
        	 head = null;
        }else {
        	 head = head.next;
             head.prev = null;
        }
       
        size--;
        System.out.println("deleted: "+tmp.element);
        return tmp.element;
    }
     
    /**
     * this method removes element from the end of the linked list
     * @return
     */
    @Override
    public E removeLast() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: "+tmp.element);
        return tmp.element;
    }

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
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