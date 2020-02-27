public class StackFactory<E> {
	
   //use getShape method to get object of type shape 
   public iStack<Integer> getStack(String tipoStack){
      if(tipoStack == null){
         return null;
      }		
      if(tipoStack.equalsIgnoreCase("ArrayList")){
         return new StackArrayList<Integer>();
         
      } else if(tipoStack.equalsIgnoreCase("Vector")){
         return new StackVector<Integer>();
         
      } else if(tipoStack.equalsIgnoreCase("Lista")){
         return new StackLista<Integer>();
      }
      
      return null;
   }
}