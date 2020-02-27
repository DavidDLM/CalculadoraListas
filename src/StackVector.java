/**
 * Contrato de Stack implementado con Vector 
 * extraido de 
 * Duane A. Bailey. (2007) Java Structures (The 7 Edition)
 */
import java.util.Vector;

public class StackVector<E> implements iStack<E>{
	
    protected Vector<E> data;
    
    public StackVector()
    // post: an empty stack is created
    {
    	data = new Vector<E>();
    }

    public StackVector(int size)
    {
        data=new Vector<E>(size);
    }
    

    public void push(E item)
    // post: the value is added to the stack
    //          will be popped next if no intervening push
    {
        data.add(item);
 
    }

    public E pop() 
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
        E p = null;
        if( !data.isEmpty()) {
        p = (E) data.lastElement();
         data.remove( data.size() - 1);
        }
    return p;
    }

    public E peek() 
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
        return (E)data.lastElement();
    }

    public int size()
    // post: returns the number of elements in the stack
    {
    return data.size();
    }
    
    public boolean empty()
    // post: returns true if and only if the stack is empty
    {
        return size() == 0;
    }
    
    public void clear()
    // post: removes all elements from stack
    {
    	data.clear();
    }

}