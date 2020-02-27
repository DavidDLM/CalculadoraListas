/**
 * Funciones de Stack implementado con Linked list
 * con iterador extraído de 
 * http://cs-fundamentals.com/data-structures/stack-implementation-using-linked-list-in-java.php
 */
/* LinkedStack.java */
import java.lang.Iterable;
import java.util.*;
 
public class StackLista<E> implements iStack <E>
{
  private Node head; //the first node
  private int size; // number of items
 
  //Nested class to define node
  private class Node
  {
    E item;
    Node next;
  }
 
  //Zero argument constructor
  public StackLista()
  {
    head = null;
    size = 0;
  }
 
  //Check if stack is empty	
  public boolean isEmpty()
  {
    return (size == 0);
  }
 
  //Remove item from the beginning of the list.
  public E pop()
  {
    E item = head.item;
    head = head.next;
    size--;
    return item;
  }
 
  //Add item to the beginning of the list.
  public void push(E item)
  {
    Node oldHead = head;
    head = new Node();
    head.item = item;
    head.next = oldHead;
    size++;
  }
 
  //Return number of items present in the stack
  public int size()
  {
    return size;
  }
 
  //Iterator for traversing stack items
  public Iterator<E> iterator()
  {
    return new StackListaIterator();
  }
 
  //inner class to implement iterator interface
  private class StackListaIterator implements Iterator <E>
  {
    private int i = size;
    private Node first = head; //the first node
 
    public boolean hasNext()
    {
      return (i > 0);
    }
 
    public E next()
    {
      E item = first.item;
      first = first.next;
      i--;
      return item;
    }
 
    public void remove()
    {
      // not needed
    }
  }

@Override
public E peek() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean empty() {
	// TODO Auto-generated method stub
	return false;
}
}
