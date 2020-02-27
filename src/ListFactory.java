public class ListFactory<E> {
	
   //use getShape method to get object of type shape 
   public iList<Integer> getList(String tipoList){
      if(tipoList == null){
         return null;
      }		
      if(tipoList.equalsIgnoreCase("Simple")){
         return new singlyLinkedList<Integer>();
         
      } else if(tipoList.equalsIgnoreCase("Double")){
         return new doublyLinkedList<Integer>();
         
      } else if(tipoList.equalsIgnoreCase("Circular")){
         return new CircularList<Integer>();
      }
      
      return null;
   }
}


