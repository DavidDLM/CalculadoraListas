/**
 * Codigo extraido de:
 * Titulo: Funciones de Node para listas
 * Autor/Fecha: Duane A. Bailey. (2007) 
 * Fuente: Java Structures (The 7 Edition)
 * 
 * 
 * Funciones de la clase Node, implementada en las clases Listas
 */
public class Node<E>{
   protected E element; // value stored in this element
   protected Node<E> nextElement; // ref to next

   public Node() {
       this(null, null); 
   }
   
   public Node(E element, Node<E> nextElement)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
	   this.element = element;
       this.nextElement = nextElement;
   }

   public Node(E v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }
   
   public E getElement() {
	   return element;
   }

   public Node<E> next()
   // post: returns reference to next value in list
   {
      return nextElement;
   }
   
   public void setElement(E element) {
	   this.element = element;
   }

   public void setNext(Node<E> next)
   // post: sets reference to new next value
   {
      nextElement = next;
   }

   public E value()
   // post: returns value associated with this element
   {
      return element;
   }

   public void setValue(E value)
   // post: sets value associated with this element
   {
      element = value;
   }
}